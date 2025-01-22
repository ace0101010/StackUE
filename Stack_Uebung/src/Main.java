public class Main {
    public static void main(String[] args) {
        try {

            // Test with a stack of integers
            Stack<Integer> intStack = new Stack<>(5);
            System.out.println("Testing integer stack:");
            intStack.push(10);
            intStack.push(20);
            intStack.push(30);
            
            System.out.println("List: " + intStack.list()); // Expect: 10;20;30
            System.out.println("Peek: " + intStack.peek()); // Expect: 30
            System.out.println("Pop: " + intStack.pop()); // Expect: 30
            System.out.println("List after pop: " + intStack.list()); // Expect: 10;20

            // Test with a stack of strings
            Stack<String> stringStack = new Stack<>(3);
            System.out.println("\nTesting string stack:");
            stringStack.push("Hello");
            stringStack.push("World");
            System.out.println("List: " + stringStack.list()); // Expect: Hello;World
            System.out.println("Peek: " + stringStack.peek()); // Expect: World
            System.out.println("Pop: " + stringStack.pop()); // Expect: World
            System.out.println("List after pop: " + stringStack.list()); // Expect: Hello

            stringStack.pop(); // Pops "Hello"
            stringStack.pop(); // Should throw exception

        } catch (Stack.StackFullException | Stack.StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}