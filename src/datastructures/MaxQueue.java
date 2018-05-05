package datastructures;

public class MaxQueue<E extends Comparable<E>> {
    private MaxStack<E> in;
    private MaxStack<E> out;

    public MaxQueue() {
        in = new MaxStack<>();
        out = new MaxStack<>();
    }

    public void enqueue(E value) {
        in.push(value);
    }

    public E dequeue() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public E max() {
        if (out.isEmpty()) {
            return in.max();
        } else if (in.isEmpty()) {
            return out.max();
        } else {
            return in.max().compareTo(out.max()) > 0 ? in.max() : out.max();
        }
    }
}
