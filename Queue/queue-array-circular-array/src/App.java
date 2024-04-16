public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Queue a = new Queue(5);
        a.enqueue(90);
        a.enqueue(50);
        a.enqueue(20);
        a.enqueue(990);
        a.printQueue();
        System.out.println("Front>>" + a.getFront());
        a.dequeue();
        a.printQueue();
        System.out.println("Front>>" + a.getFront());
    }
}
