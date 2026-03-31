/**
 * HelloApp - UC2 - Display Hello with Command-Line Argument
 * @author Adit
 * @version 2.0
 */
public class HelloApp {
    public static void main(String[] args) {
        
        // Check if user provided a name as command-line argument
        if (args.length > 0) {
            // Get the name from command-line argument
            String name = args[0];
            
            // Display personalized greeting
            System.out.println("Hello, " + name);
        } else {
            // No argument provided, display default
            System.out.println("Hello World");
        }
        
    }
}