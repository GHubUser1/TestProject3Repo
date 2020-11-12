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
    	
        System.out.println( System.getProperty("message") );
        String messageinput = System.getProperty("message");
        
        System.out.println("-------------------------------------");
        System.out.println(messageinput);
        
        Logger log = Logger.getLogger("myFirstLog");
        log.info("---------------" + messageinput);
        
    }
}
