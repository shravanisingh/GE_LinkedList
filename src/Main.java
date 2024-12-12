public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        list.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        System.out.println("Linked List:");
        list.display();
    }
}