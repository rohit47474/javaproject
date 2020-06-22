package com.ex;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

 
public class Details {
	/* Get the class name to be printed on */  
	   static Logger log = Logger.getLogger(Details.class.getName());  
	     
	   public static void main(String[] args)throws IOException,SQLException{  
		   log.debug("Hello this is a debug message");  
		      log.info("Hello this is an info message");  
	    log.error("THis is error message");
			
	      System.out.println("Executed Log4j");
	   }  
}
