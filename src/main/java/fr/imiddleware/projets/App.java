package fr.imiddleware.projets;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        String messageinput = System.getProperty("MessageInput");
        
        Logger log = Logger.getLogger("myFirstLog");
        log.info("---------------" + messageinput);
    }
}
