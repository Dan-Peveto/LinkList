public class MyQueue {
    
    // Data
    LinkedList values = new LinkedList();
    // Actions
    
    public void Enqueue(int someValue) {
        values.AddLast(someValue);
    }

    public int Dequeue() throws Exception {
        int Deqeued = values.head.value;
        values.DeleteFirst();
        return Deqeued;
    }

    public int Peek() {
        return values.head.value;
    }

    public boolean IsEmpty() {
        return values.IsEmpty();
    }
    public void Print() {
        values.Print();
    }

    // Init
}
