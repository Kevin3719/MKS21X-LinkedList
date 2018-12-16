class MyLinkedList{
 private int length;
 private Node start,end;
 public MyLinkedList() {
   length = 0;
 }
 // sets everything back to beginning
public void clear() {
  start = null;
  end = null;
  length = 0;
}
// returns length thats about it
 public int size() {
   return length;
 }
 // 2 cases 1. if there is an empty MyLinkedList 2 if there isnt
 // if there is
 public boolean add(int value) {
   if (length == 0) {
     Node input = new Node(value);
     end = input;
     start = input;
   } else {
     Node input = new Node(end, value);
     end.setNext(input);
     end = input;
   }
   length += 1;
   return true;
 }
private Node getNode(int index) {
  if (index >= length) {
    throw new IndexOutOfBoundsException("index is out of range (index < 0 || index >= size())");
  }
  int b = 0;
  Node current = start;
  while(b < index) {
    current = current.next();
    b += 1;
  }
  return current;
}

public Integer get(int index) {
  return getNode(index).getData();
}

public Integer set(int index,Integer value) {
  if (index >= length) {
    throw new IndexOutOfBoundsException("index is out of range (index < 0 || index >= size())");
  }
  int output = get(index);
  getNode(index).setData(value);
  return output;
}

  public boolean contains(Integer value) {
  /*  Node current = start;
    for (int i = 0; i < length; i += 1) {
      if (current.getData() == value) {
        return true;
      }
      current = current.next();
    }
    return false;
    */
    return indexOf(value) > -1;
  }

  public int indexOf(Integer value) {
    Node current = start;
      for (int i = 0; i < length; i += 1) {
        if (current.getData() == value) {
          return i;
        }
        current = current.next();
      }
      return -1;
  }

  public boolean add(int index,Integer a) {
    Node indexNode = getNode(index);
    Node current = new Node(a,indexNode);
    if(index < length - 1) {
      current.setNext(indexNode.next());
    }
    return true;
  }

 public String toString() {
   String output = "[";
   Node current = start;
   for (int i = 0; i < length - 1; i += 1) {
     output += current + ",";
     current = current.next();
   }
   output += current + "]";
   return output;
 }
}
