package datastructures;

public class MaxStack<E extends Comparable<E>> extends SimpleStack<E> {
    private Stack<E> max;

    public MaxStack() {
        super();
        max = new SimpleStack<>();
    }

    public E max() {
        return max.top();
    }

    @Override
    public E pop() {
        max.pop();
        return super.pop();
    }

    @Override
    public void push(E value) {
        super.push(value);
        max.push(
                !max.isEmpty()
                        && max().compareTo(value) > 0
                        ? max()
                        : value
        );
    }
}
