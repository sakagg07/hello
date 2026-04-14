public class HelloApp {
    public static void main(String[] args) {

        // If no arguments → default
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {
            // Using String.join()
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}