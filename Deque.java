package lesson3;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Deque<T>{
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    public Deque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public Deque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public int size() {
        return size;
    }

    public T peekBegin() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    public T peekEnd() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size-1];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public void insertRight(T item) {
        if (size == list.length) {
            resize(2 * list.length);
        }
        list[end++] = item;
        end %= list.length;
        size++;
    }

    public void insertLeft(T item) {
        if (size == list.length) {
            resize(2 * list.length);
        }
        for (int i = size; i > 0 ; i--) {
            list[i] = list[i - 1];
        }
        list[begin] = item;
        end++;
        end %= list.length;
        size++;
    }

    public T removeLeft() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T type = (T) list[begin];
        size--;
        begin++;
        begin %= list.length;
        if (size == list.length / 4) {
            resize(list.length / 2);
        }
        return type;
    }

    public T removeRight() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T type = (T) list[size - 1];
        size--;
        if (size == list.length / 4 && size > 0) {
            resize(list.length / 2);
        }
        return type;
    }

    private void resize(int index) {
        Object[] newDeque = new Object[index];
        for (int i = 0; i < size; i++) {
            newDeque[i] = list[(begin + i) % list.length];
        }
        list = (T[]) newDeque;
        begin = 0;
        end = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!isEmpty()) {
            int i = begin;
            while (i != end) {
                sb.append(list[i]).append(", ");
                i = nextIndex(i);
            }
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

}
