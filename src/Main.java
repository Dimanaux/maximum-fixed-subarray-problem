import datastructures.MaxQueue;

public class Main {
    public static void main(String[] args) {
        int m = 3;
        int[] array = new int[] {5, 1, 3, 2, 4, 6, 1, 7, 3, 2, 8};

        MaxQueue<Integer> maxQueue = new MaxQueue<>();

        int i;
        for (i = 0; i < m; i++) {
            maxQueue.enqueue(array[i]);
        }

        System.out.print(maxQueue.max() + " ");

        for (; i < array.length; i++) {
            maxQueue.dequeue();
            maxQueue.enqueue(array[i]);
            System.out.print(maxQueue.max() + " ");
        }
    }
}
