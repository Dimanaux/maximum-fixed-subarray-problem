package datastructures;

import java.util.LinkedList;
import java.util.List;

public class SimpleStack<E> implements Stack<E> {
    private List<E> stack;

    SimpleStack() {
        stack = new LinkedList<>();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public E pop() {
        return stack.remove(0);
    }

    @Override
    public E top() {
        return stack.get(0);
    }

    @Override
    public void push(E value) {
        stack.add(0, value);
    }
}
