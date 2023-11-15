public class MyStack {
    
    // data
    LinkedList values = new LinkedList();
    // actions
    public void Push(int someValue) {
        values.AddFirst(someValue);
    }
    
    public int Pop() throws Exception {
        int popped = values.head.value;
        values.DeleteFirst();
        return popped;
    }

    public int Peek() {
        return values.head.value;
    }

    // IsEmpty
    public boolean IsEmpty() {
        return values.IsEmpty();
    }
    // Print
    public void Print() {
        values.Print();
    }
    // contructors initializers
  }
