package mylib;

public class MyArrayList {

    public static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(Object element) {
        if (size >= elements.length) {
            Object[] temp = new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
        elements[size++] = element;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error: Index out of bound!");
            return null;
        }
        return elements[index];
    }
}
