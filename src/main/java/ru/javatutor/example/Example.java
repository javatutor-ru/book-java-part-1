package ru.javatutor.example;

import java.util.logging.Logger;

public class Example {
    private static final Logger logger = Logger.getLogger(Example.class.getName());

    public static void main(String[] args) {
        logger.info("Run main() in Example");
    }

   public void print() {
       System.out.println("Example");
   }
}
