public class Stack {
    private LL x; // composition
    Node top;

    Stack() {
        x = new LL();
        top = null;
    }

    public void push(int v) {
        // to the end
        // x.insertLast(v);
        // top = x.getLast();

        // to the beginning
        x.insertFirst(v);
        top = x.getHead();

    }

    public void pop() {
        // from the end
        // x.removeLast();
        // top = x.getLast();

        // from the beginning
        x.removeFirst();
        top = x.getHead();

        
    }

    int getTop() {
        if(x.isEmpty()) {
            return -1;
        }
        return top.value;
    }

    public void printStack() {
        x.printLL();
    }

}


