class MyLinkedList{
 private int length;
 private Node start,end;
 public MyLinkedList() {
   length = 0;
 }
public void clear() {
  start = null;
  end = null;
  length = 0;
}
 public int size() {
   return length;
 }
 public boolean add(int value) {
   Node input = new Node(end,value);
   if (length == 0) {
     end = input;
     start = input;
   }
   return true;
 }


 public String toString() {
   return "";
 }
}
