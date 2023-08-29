public class BugExample {

    public static void main(String[] args) {
        // Bug 1: Index out of bounds error
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]); // This will cause an IndexOutOfBoundsException
        
        // Bug 2: Infinite loop
        int counter = 0;
        while (counter >= 0) {
            System.out.println("Loop iteration: " + counter);
            counter++; // This will eventually cause an overflow and the loop will continue
        }
        
        // Bug 3: Division by zero
        int a = 10;
        int b = 0;
        int result = a / b; // This will cause an ArithmeticException
        
        // Bug 4: Null pointer dereference
        String text = null;
        System.out.println(text.length()); // This will cause a NullPointerException
        
        // Bug 5: Unreachable code
        boolean condition = false;
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This will always be printed");
        }
    }
}

