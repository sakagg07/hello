/**
 * HelloApp - UC3 - Display Hello with Command-Line Argument or Default Message
 * @author Adit
 * @version 3.0
 */
public class HelloApp{
    public static void main(String[] args) {
        
        
        if (args.length > 0) {
            String name = args[0];
            
            System.out.println("Hello " + name);
        } else {
            String defaultName = "World";
            System.out.println("Hello " + defaultName);
        }
        
    }
}