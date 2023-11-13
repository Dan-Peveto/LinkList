

public class SinglyLinkedList {
    
    public static void main(String[] args) throws Exception  {
        /*
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        n1.next = n2;
        n2.next = n3;
        System.out.println("Node 1 value: " + n1.value);
        System.out.println("Node 2 value: " + n2.value);
        System.out.println("Node 2 value from node 1 : " + n1.next.value);
        System.out.println("Node 3 value: " + n3.value);
        System.out.println("Node 3 value from node 1: " + n1.next.next.value);
         */

        LinkedList list = new LinkedList();
        list.AddFirst(10);
        list.AddFirst(20);
        list.AddFirst(30);
        list.Print();
        list.AddLast(15);
        list.Print();
        list.AddLast(25);
        list.Print();
        list.AddLast(35);
        list.Print();
        LinkedList list2 = new LinkedList();
        list2.AddLast(5);
        list2.Print();
        LinkedList emptyList = new LinkedList();
        emptyList.Print();
        list.DeleteFirst();
        list.Print();
    }   
}
