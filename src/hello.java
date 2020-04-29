import org.apache.log4j.Logger;

public class hello {

	public static void main(String[] args) {
	    Logger log = Logger.getLogger(hello.class);
	   
	        System.out.println("Hello Log4J");
	        log.debug("Logger Debug");
	        log.info("Logger Info");
	        log.error("Error");
	   
	

	}

}
