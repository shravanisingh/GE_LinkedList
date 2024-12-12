public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(56);
        list.head.next = new Node(70);
        list.insertAtPosition(1, 30);
        list.display();
        if (list.search(30)) {
            System.out.println("Node with value 30 found.");
            list.insertAfterValue(30, 40);
            System.out.print("Final Sequence: ");
            list.display();
        } else {
            System.out.println("Node with value 30 not found.");
        }

    }
}