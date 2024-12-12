public class Node implements Comparable<Node> {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.data, other.data);
    }
}