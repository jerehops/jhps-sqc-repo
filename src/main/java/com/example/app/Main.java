package com.example.app;

import java.util.logging.Logger;

public class Main {

  static Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    logger.info("My Message");
  }
  
  public static String greet(String name) {
    return "Hello, " + name + "!";
  }
}
