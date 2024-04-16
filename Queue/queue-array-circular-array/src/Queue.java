public class Queue {
    private int Q[];
    private int front;
    private int rear;

    Queue(int size) {
        front = -1;
        rear = -1;
        Q = new int[size];
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (rear == Q.length - 1);
    }

    // we enqueue to the end (rear)
    public void enqueue(int v) {
        if (isFull()) {
            return;
        } else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        Q[rear] = v;
    }

    // we dequeue from the begin (front)
    public void dequeue() {
        if(isEmpty()) {
            return;
        } else if(front == rear) { //one element
            front = -1;
            rear = -1;
            Q[front] = 0;
        } else {
            Q[front] = 0;
            front++;
        }
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        } else return Q[front];
    }

    public void printQueue() {
        for (int i = 0; i < Q.length; i++) {
            System.out.println(Q[i]);
        }
    }
}
