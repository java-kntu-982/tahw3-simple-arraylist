package ir.ac.kntu;

/**
 * @author yourname
 */
public class SimpleArrayList {
    private int size = 10;
    private int nextIndex = 0;
    private String[] elements = new String[size];

    public void add(String input) {
        //Delete This line and write your code
        throw new UnsupportedOperationException("Delete me - add");
    }

    public boolean remove(int index) {
        //Delete This line and write your code
        throw new UnsupportedOperationException("Delete me - remove1");
    }

    public boolean remove(String input) {
        //Delete This line and write your code
        // requires the implementation of search method
        throw new UnsupportedOperationException("Delete me - remove2");
    }

    private void grow() {
        // TODO: this method is used when the elements array is full
        //Delete This line and write your code
        throw new UnsupportedOperationException("Delete me - grow");
    }

    public void printAll() {
        //Delete This line and write your code
        throw new UnsupportedOperationException("Delete me - printAll");
    }

    public void reset() {
        //Delete This line and write your code
        throw new UnsupportedOperationException("Delete me - reset");
    }

    public void append(String[] array) {
        //Delete This line and write your code
        throw new UnsupportedOperationException("Delete me - append");
    }

    //use any sorting algorithm - suggested = bubble sort or insertion sort
    //sort by string's length
    public void sort() {
        //Delete This line and write your code
        throw new UnsupportedOperationException("Delete me - sort");
    }

    //use any searching algorithm - binary search or linear search
    public int search(String string) {
        // TODO: 10/9/19 use equals method
        //Delete This line and write your code
        throw new UnsupportedOperationException("Delete me - search");
    }
    public String[] getElements() {
        return elements;
    }

    public int getSize() {
        return size;
    }

    public int getNextIndex() {
        return nextIndex;
    }
}
