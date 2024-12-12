public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(56);
        list.head.next = new Node(70);
        list.insertAtPosition(1, 30);
        list.insertAtPosition(2, 40);
        System.out.print("Initial Sequence: ");
        list.display();

        if (list.search(40)) {
            System.out.println("Node with value 40 found.");
            list.deleteNode(40);
            System.out.print("Final Sequence: ");
            list.display();
            System.out.println("Size of LinkedList: " + list.size());
        } else {
            System.out.println("Node with value 40 not found.");
        }

    }
}