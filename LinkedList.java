public class LinkedList {
    //data 
    Node head;
    Node tail;
    // actions - methods
    //AddFirst
    public void AddFirst(int someValue) { // O(1)
        // create new node
        Node newNode = new Node(someValue);
        // if empty
        if(IsEmpty()) {
            head = tail = newNode;
        } else {
        // link node to head
        newNode.next = head;
        // new node becomeshead
        head = newNode;
        }
    }
    //Print - traversal
    public void Print() { // O(n)
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
    public void AddLast(int someValue) { // O(1)
        if(IsEmpty()) {
            AddFirst(someValue);
        } else {
        // create a new node
        Node newNode = new Node(someValue);
        // newNode tail 
        tail.next = newNode;
        tail = newNode;
        }
    }
    //IsEmpty
    public boolean IsEmpty(){ // O(1)
        return head==null;
    }
    //deletes First //O(1)
    public void DeleteFirst() throws Exception {
        if(IsEmpty()) {
            throw new Exception("You cannot delete from empty list");
        } else if(head.next == null) {
            head = tail = null;
        } else { //there are at least two nodes
        head = head.next;
        }
    }
    // Delete Last //O(n)
    public void DeleteLast() throws Exception { //O(n)
        if(IsEmpty()) {
            throw new Exception("You cannot delete from empty list");
        } else if (head.next == null) {
        // if size is 1
            DeleteFirst();
        } else {
        // find the next to last node
        Node finger = head;
        while(finger.next.next != null) {
            finger = finger.next;
            }
            // move finger.next
            finger.next = null;
            // move tail 
            tail = finger;
        }
    }
    public void Clear() { //O(1)
        head = tail = null;
    }
}
