package com.log;


import org.apache.log4j.Logger;  

import java.io.*;  
import java.sql.SQLException;  
import java.util.*;  
  
public class HelloWorld{  
  
   /* Get the class name to be printed on */  
   static Logger log = Logger.getLogger(HelloWorld.class.getName());  
     
   public static void main(String[] args)throws IOException,SQLException{  
      log.debug("Hello this is a debug message");  
      log.info("Hello this is an info message");
      log.warn("Sample warn message");  
      log.error("Sample error message");  
      log.fatal("Sample fatal message");  
      System.out.println("Executed Log4j");
   }  
}  