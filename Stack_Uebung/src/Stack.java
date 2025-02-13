public class Stack<T> {
    private T[] elements;
    private int top = 0;
    private int capacity = 10;

    // Constructor
    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = ((T[]) new Object[capacity]);
        this.top = -1; // Stack is initially empty
    }

    // Add an element to the top of the stack
    public void push(T element) throws StackFullException {
        if (top == capacity - 1) {          // Check if the stack is full
            throw new StackFullException("Stack is full. Cannot push element.");
        }
        elements[++top] = element;          // Increment top and add the element
    }

    // Remove and return the top element of the stack
    public T pop() throws StackEmptyException {
        if (top == -1) { // Check if the stack is empty
            throw new StackEmptyException("Stack is empty. Cannot pop element.");
        }
        return elements[top--]; // Return top element and decrement top
    }

    // Return the top element of the stack without removing it
    public T peek() throws StackEmptyException {
        if (top == -1) { // Check if the stack is empty
            throw new StackEmptyException("Stack is empty. Cannot peek element.");
        }
        return elements[top]; // Return the top element
    }



    // Method to return a semicolon-separated string of all elements in the stack
    public String list() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= top; i++) {           // Iterate over the stack elements
            result.append(elements[i].toString()); // Add element to the string
            if (i < top) {
                result.append(";");                // Add semicolon between elements
            }
        }
        return result.toString();                  // Return the  string
    }


    // Exception class for handling stack full
    public static class StackFullException extends Exception {
        public StackFullException(String message) {
            super(message);
        }
    }

    // Exception class for handling stack empty
    public static class StackEmptyException extends Exception {
        public StackEmptyException(String message) {
            super(message);
        }
    }
}
