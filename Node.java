class Node{
 private int data;
 private Node next,prev;
 public Node(Node a,int b,Node c) {
   prev = a;
   data = b;
   next = c;
 }
 public Node(int b,Node c) {
   data = b;
   next = c;
 }
 public Node(Node a,int b) {
   prev = a;
   data = b;
 }
 public int get() {
   return data;
 }
 public void set(int i) {
   data = i;
 }
 public Node next() {
   return next;
 }
 public Node prev() {
   return prev;
 }

}
