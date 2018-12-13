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
}
