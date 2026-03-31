/**
 * HelloApp - UC4 - Display Hello with Multiple Command-Line Arguments or Default Message
 * @author Adit
 * @version 4.0
 */
public class HelloApp{
    public static void main(String[] args) {
        
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                String name = args[i];
                System.out.println("Hello " + name);
            }
        } else {
            String defaultName = "World";
            System.out.println("Hello " + defaultName);
        }
        
    }
}