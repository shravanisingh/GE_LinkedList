public class LinkedList {
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null || head.compareTo(newNode) >= 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.compareTo(newNode) < 0) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }


    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}