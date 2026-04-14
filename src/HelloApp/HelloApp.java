package HelloApp;
public class HelloApp {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        // If no arguments → default
        if (args.length == 0) {
            names.append("World");
        } else {
            // Enhanced for loop
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
        }

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}