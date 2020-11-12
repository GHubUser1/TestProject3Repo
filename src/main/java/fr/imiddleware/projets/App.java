package fr.imiddleware.projets;
import java.util.logging.Logger;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
/**
 * Hello world!
 *
 */

@Mojo( name = "NewMavenGoal")
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
