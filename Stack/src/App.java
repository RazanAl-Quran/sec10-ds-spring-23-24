// import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
              Stack s1 = new Stack();
              s1.push(5);
              s1.push(7);
              s1.push(10);
              s1.printStack();
              System.out.println("top>>"+s1.getTop());
              s1.pop();
              s1.printStack();
              System.out.println("top>>"+s1.getTop());
              s1.getTop();

    }
}
