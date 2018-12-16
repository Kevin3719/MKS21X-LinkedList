public class Drivertester {
  public static void main(String[] args) {
    MyLinkedList a = new MyLinkedList();
    a.add(3);
    a.add(4);
    a.add(60);
    System.out.println(a.get(2));
    System.out.println(a.set(1,40));
    System.out.println(a.get(1));
    System.out.println(a);
    System.out.println(a.contains(2));
    System.out.println(a.contains(3));
    System.out.println(a.contains(60));
    System.out.println(a.contains(40));
    System.out.println(a.contains(4));
    System.out.println(a.indexOf(4));
    System.out.println(a.indexOf(3));
    System.out.println(a.indexOf(40));
    System.out.println(a.add(2,5));
    System.out.println(a.get(1));
    System.out.println(a.get(2));
    System.out.println(a);
    System.out.println(a.remove(1));
    System.out.println(a.remove(1));
    System.out.println(a);
    for (int i = 0 ;i < 6 ; i += 1){
    System.out.println(a.add(i));}
    System.out.println(a);
    System.out.println(a.remove(Integer.valueOf(4)));
    System.out.println(a);
  }

}
