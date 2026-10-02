/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

public class LRUCache {
    int capacity;
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    HashMap<Integer, Node> cache = new HashMap();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.right = tail;
        tail.left = head;
    }

    public class Node {
        int key;
        int value;
        Node left;
        Node right;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public void insertTail(Node node) {
        tail.left.right = node;
        node.left = tail.left;
        node.right = tail;
        tail.left = node;
        cache.put(node.key, node);
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        Node node = cache.get(key);
        delete(key);
        insertTail(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            delete(key);
        }

        Node node = new Node(key, value);
        insertTail(node);

        if (cache.size() > capacity) {
            Node leastUsedNode = head.right;
            delete(leastUsedNode.key);
        }
    }

    public void delete(int key) {
        Node node = cache.get(key);
        node.left.right = node.right;
        node.right.left = node.left;
        cache.remove(key);
    }
}
