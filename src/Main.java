public class Main {
    public static void main(String[] args) {
        Node startNode = new Node(56);
        LinkedList list = new LinkedList(startNode);

        list.append(30);
        list.append(70);

        list.printList();
    }
}