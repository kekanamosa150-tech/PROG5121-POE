/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quickchat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QuickChat {
    private static final List<String> messages = new ArrayList<>();
    private static boolean isLoggedIn = false;
  
   
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        login(scanner);
        System.out.println("Welcome to QuickChat.");
        int messageLimit = setMessageLimit(scanner);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1) Send Messages");
            System.out.println("2) Show Recently Sent Messages");
            System.out.println("3) Quit");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: sendMessages(scanner, messageLimit);
                break;
                case 2:showMessages();
                break;
                case 3:
                 System.out.println("Quitting the application...");
                  return;
                  default: System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void login(Scanner scanner) {
        String username;
        String password;
         
        while (!isLoggedIn) {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
           
           if (username.equals(username) && password.equals(password)) {
           isLoggedIn = true;
            } 
            else{
                System.out.println("Login failed. Try again.");
            }
        }
    }

    private static int setMessageLimit(Scanner scanner) {
        System.out.print("How many messages do you want to send? ");
        return scanner.nextInt();
    }

    private static void sendMessages(Scanner scanner, int limit) {
        scanner.nextLine(); 
        for (int i = 0; i < limit; i++) {
            System.out.print("Enter message " + (i + 1) + ": ");
            String message = scanner.nextLine();
            messages.add(message);
        }
    }

    private static void showMessages() {
        if (messages.isEmpty()) {
            System.out.println("No messages available.");
        } else {
            System.out.println("Recently sent messages:");
            for (String msg : messages) {
                System.out.println(msg);
            }
        }
        System.out.println("Coming Soon.");
    }
}
class message{
private String messageId;
private String recipientCell; 
private String messageHash; 
private static final List<String>sentMessages = new ArrayList<>();
  
public boolean  checkMessageId(String messageId) {        
    if (messageId.length() <= 10) {           
        this.messageId = messageId;            
        return true;       
    }        
    return false;    
    }   
   
public String checkRecipientCell(String recipientCell) {       
    if (recipientCell.length() <= 10 && recipientCell.startsWith("+27")) {      
        this.recipientCell = recipientCell;          
        return recipientCell;       
    }     
    return "Invalid cell number";    
    }  
 
     public String createMessageHash(String message) { 
     this.messageHash = Integer.toHexString(message.hashCode());      
     return this.messageHash;  
    }    

     public String sendMessage(String message) {       
     sentMessages.add(message);       
     return "Message sent: " + message;    
   }  

     public String printMessages(){   
     return String.join(", ", sentMessages);    
     }   
     public int returnTotalMessages() {      
     return sentMessages.size();   
   }         
  
}


    


    
   




