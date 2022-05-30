package myapp.core;

import java.io.Console;

public class Greetings {
    //write entry point 
    public static void main (String[]args) {
        //get the console 
        Console cons = System.console();

        //read from input 
        String name = cons.readLine("What is your name?");

        System.out.printf("[%d] Hello %s. Nice to meet you.\n",10,name.toUpperCase());

    }
    
}
