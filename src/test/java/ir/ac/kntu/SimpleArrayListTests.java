package ir.ac.kntu;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

/**
 * @author M.Mahdi Kheirmand
 */
@SuppressWarnings("JavaReflectionMemberAccess")
public class SimpleArrayListTests {
    private final String ID1 = "1", ID2 = "2", ID3 = "3", ID4 = "4", ID5 = "5";
    private final String ID6 = "7", ID7 = "7", ID8 = "8", ID9 = "9", ID10 = "10";
    private final String ID11 = "11", ID12 = "12";
    private SimpleArrayList simpleArrayList;


    @BeforeEach
    public void prepare(){
        simpleArrayList = new SimpleArrayList();
    }

    @BeforeAll
    public static void setUp(){
        System.err.println("#### Starting Unit Tests | SimpleArrayList ####");
    }

    @Test
    public void testAdd1(){
        simpleArrayList.add(ID1);
        String []elements = simpleArrayList.getElements();
        String actual = elements[simpleArrayList.getNextIndex()-1];
        assertEquals(ID1,actual);
    }

    @Test
    public void testAdd2(){
        simpleArrayList.add(ID1);
        simpleArrayList.add(ID3);
        simpleArrayList.add(ID2);
        String []elements = simpleArrayList.getElements();
        assertEquals(ID3,elements[1]);
        assertEquals(ID2,elements[simpleArrayList.getNextIndex()-1]);
    }

    @Test
    public void testAddGrow(){
        simpleArrayList.add(ID1);
        simpleArrayList.add(ID2);
        simpleArrayList.add(ID3);
        simpleArrayList.add(ID4);
        simpleArrayList.add(ID5);
        simpleArrayList.add(ID6);
        simpleArrayList.add(ID7);
        simpleArrayList.add(ID8);
        simpleArrayList.add(ID9);
        simpleArrayList.add(ID10);
        try{
            simpleArrayList.add(ID11);
            simpleArrayList.add(ID12);
            String []elements = simpleArrayList.getElements();
            assertEquals(ID12,elements[11]);
        } catch (Exception e){
            fail();
        }
    }

    @Test
    public void testRemoveInt(){
        simpleArrayList.add(ID1);
        simpleArrayList.add(ID3);
        simpleArrayList.add(ID2);
        simpleArrayList.remove(0);
        String []elements = simpleArrayList.getElements();
        assertEquals(ID3,elements[0]);
        assertFalse(simpleArrayList.remove(5));
    }

    @Test
    public void testRemoveString(){
        simpleArrayList.add(ID1);
        simpleArrayList.add(ID3);
        simpleArrayList.add(ID2);
        simpleArrayList.remove("1");
        String []elements = simpleArrayList.getElements();
        assertEquals(ID3,elements[0]);
        assertFalse(simpleArrayList.remove("1"));
    }

    @Test
    public void testReset(){
        simpleArrayList.add(ID1);
        simpleArrayList.add(ID2);
        simpleArrayList.add(ID3);
        simpleArrayList.add(ID4);
        simpleArrayList.add(ID5);
        String []elements = simpleArrayList.getElements();
        assertEquals(ID5,elements[simpleArrayList.getNextIndex()-1]);
        simpleArrayList.reset();
        elements = simpleArrayList.getElements();
        try {
            String id1 = elements[0];
            if(id1!= null){
                fail();
            }
        } catch (Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void testResetGrow(){
        simpleArrayList.add(ID1);
        simpleArrayList.add(ID2);
        simpleArrayList.add(ID3);
        simpleArrayList.add(ID4);
        simpleArrayList.add(ID5);
        simpleArrayList.add(ID6);
        simpleArrayList.add(ID7);
        simpleArrayList.add(ID8);
        simpleArrayList.add(ID9);
        try{
            simpleArrayList.add(ID10);
            simpleArrayList.add(ID11);
            simpleArrayList.add(ID12);
            String []elements = simpleArrayList.getElements();
            assertEquals(ID12,elements[11]);
            simpleArrayList.reset();
            elements = simpleArrayList.getElements();
            try {
                String id1 = elements[0];
                if(id1!=null) {
                    fail();
                }
            } catch (Exception e){
                assertTrue(true);
            }
        } catch (Exception e){
            assertFalse(false);
        }
    }

    @Test
    public void testSort(){
        String h = "H";
        String hi = "hi";
        String hiGuys = "Hi Guys";
        String iLoveJava = "I love JAVA";
        String head = "Head TA SHAYAN :)";
        simpleArrayList.add(head);
        simpleArrayList.add(h);
        simpleArrayList.add(iLoveJava);
        simpleArrayList.add(hi);
        simpleArrayList.add(hiGuys);
        String []elements = simpleArrayList.getElements();
        simpleArrayList.sort();
        elements = simpleArrayList.getElements();
        assertEquals(h,elements[0]);
        assertEquals(hi,elements[1]);
        assertEquals(hiGuys,elements[2]);
        assertEquals(iLoveJava,elements[3]);
        assertEquals(head,elements[4]);
    }
}
