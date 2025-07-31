/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsecb;

import banking.bankingClass;
import java.util.Scanner;

/**
 *
 * @author Zyriel
 */
public class Appsecb {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        int tries = 3;
        switch(choice){
            case 1:
                bankingClass bc = new bankingClass();
                
                while (tries != 0){
                System.out.println("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = sc.nextInt();
              
                  if(bc.verifyAccount(accountNo, pin)){
                      
                      System.out.println("LOGIN SUCCESS!");
                      System.exit(0);
                  }else{
                      System.out.println("INVALID ACCOUNT!");
                      tries--;
                      System.out.println("Tries : ["+tries+"]\n");
                  }
                  
              }
              if (tries == 0){
                  System.out.println("Number of attempts has exceed limit.");
              }
                
                
                
                
                
                
                
                
                
                
                
                /* if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                    }else{
                        System.out.println("LOGIN FAILED");
                        tries--;
                        System.out.println("You have "+tries+" left");
                        
                    }*/
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
            
    }
}

}
