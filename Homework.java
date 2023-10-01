/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author kuldeep
 */

import java.util.Scanner;  // Import the Scanner class

public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Age");

 int age = myObj.nextInt();
 // Read user input 
 
 
    if(age>18){  
        System.out.print("Age is greater than 18");  
    }  
else if(age<18){  
        System.out.print("Age is less than 18");  
    } 
else {
System.out.print("wrong input");
}
}
}
