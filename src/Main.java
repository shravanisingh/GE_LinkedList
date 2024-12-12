public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(56);
        list.head.next = new Node(70);
        list.display();
        list.insertAtPosition(1, 30);
        list.display();
    }
}