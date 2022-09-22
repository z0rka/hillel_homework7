package ua.hillelit.lms.homework7.model;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class FileLoggerConfiguration {

  static Logger logger = Logger.getLogger(FileLogger.class.getName());



  public static void test(){
    File f = new File("my.txt");

    
  }

}
