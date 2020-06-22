package com.log;

import org.apache.log4j.Logger;  

import java.io.*;  
import java.sql.SQLException;  
import java.util.*;  
  
public class LogE{  
  
   /* Get the class name to be printed on */  
   static Logger log = Logger.getLogger(LogE.class.getName());  
     
   public static void main(String[] args)throws IOException,SQLException{  
	   log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message");  
    log.error("THis is error message");
		
      System.out.println("Executed Log4j");
   }  
}  