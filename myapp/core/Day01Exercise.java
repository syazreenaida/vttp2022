package myapp.core;

import java.io.Console;
import java.io.PrintStream;

public class Day01Exercise {

    private static PrintStream printf;

    public static void main (String[] args){

        //get the console 
        Console cons = System.console();

        String operand1 = cons.readLine("Enter your first number.\n");
        int op1 = Integer.parseInt(operand1.trim());
        System.out.printf("Print operand1 %s \n", op1);

        String operand2 = cons.readLine("Enter your second number.\n");
        int op2 = Integer.parseInt(operand2.trim());
        System.out.printf("Print operand2 %s \n", op2);

        String operator = cons.readLine("Operators: add, div, sub, mul\n");
        operator = operator.trim();
        System.out.printf("Print operator %s\n", operator);

        Float result = 0f;
        switch (operator.trim().toLowerCase()){
            case "add":
            result = (float)(Integer.parseInt(operand1) + Integer.parseInt(operand2));
            //print 
            break; 

            case "div":
            result = (float)(Integer.parseInt(operand1) / Integer.parseInt(operand2));
            //print
            break; 

            case "sub":
            result = (float)(Integer.parseInt(operand1) - Integer.parseInt(operand2));
            //print 
            break; 

            case "mul":
            result = (float)(Integer.parseInt(operand1) * Integer.parseInt(operand2));
            //print
            break;

            default:
            System.out.println("There is error, please try again.");
        }

        System.out.printf("The answer for %d %s %d = %.3f \n", operand1, operator, operand2, result );



    }
    
}
