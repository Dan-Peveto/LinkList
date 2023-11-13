public class LinkedList {
    //data 
    Node head;

    // actions - methods
    //AddFirst
    public void AddFirst(int someValue) {
        // create new node
        Node newNode = new Node(someValue);
        // link node to head
        newNode.next = head;
        // new node becomeshead
        head = newNode;
    }
    //Print - traversal
    public void Print() {
        if(IsEmpty()) {
            System.out.println("List is empty");
        } else {
        // put the finger on the head;
        Node finger = head;
        while(finger != null) { // repeat until null
            System.out.print(finger.value + ", ");    // display the value
            finger = finger.next; // move to the next node
            }
            System.out.println("");
        }
    }
    //AddLast
    public void AddLast(int someValue) {
        if(IsEmpty()) {
            AddFirst(someValue);
        } else {
        // create a new node
        Node newNode = new Node(someValue);
        // Find last node
        Node finger = head;
        while(finger.next != null) {
            finger = finger.next;
        }
        // Add newNode after last node
        finger.next = newNode;
        }
    }
    //IsEmpty
    public boolean IsEmpty(){
        return head==null;
    }
    //deletes First
    public void DeleteFirst() throws Exception {
        if(IsEmpty()) {
            throw new Exception("You cannot delete from empty list");
        }
        head = head.next;
    }
    //
    //init
}
