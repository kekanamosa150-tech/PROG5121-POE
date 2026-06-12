/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class storedMessage {
    
    
static ArrayList<String> senderArray = new ArrayList<>();
static ArrayList<String> recipientArray = new ArrayList<>();
static ArrayList<String> messageArray = new ArrayList<>();
static ArrayList<String> messageIdArray = new ArrayList<>();
static ArrayList<String> messageHashArray = new ArrayList<>();

public static void displayMessageReport() {

    System.out.println("\n----- MESSAGE REPORT -----");

    for (int i = 0; i < messageArray.size(); i++) {

        System.out.println("Message ID: " +
                messageIdArray.get(i));
        System.out.println("Hash: " +
                messageHashArray.get(i));
        System.out.println("Sender: " +
                senderArray.get(i));
        System.out.println("Recipient: " +
                recipientArray.get(i));
        System.out.println("Message: " +
                messageArray.get(i));
        System.out.println("--------------------------------");
    }
}
public static void deleteMessage(String hash) {

    int index = messageHashArray.indexOf(hash);

    if (index != -1) {

        senderArray.remove(index);
        recipientArray.remove(index);
        messageArray.remove(index);
        messageIdArray.remove(index);
        messageHashArray.remove(index);

        System.out.println("Message deleted successfully.");
    } else {
        System.out.println("Hash not found.");
    }
}

public static void searchMessagesByRecipient(String recipient) {

    boolean found = false;

    for (int i = 0; i < recipientArray.size(); i++) {

        if (recipientArray.get(i).equals(recipient)) {

            System.out.println("Message ID: " +
                    messageIdArray.get(i));
            System.out.println("Message: " +
                    messageArray.get(i));
            System.out.println();

            found = true;
        }
    }

    if (!found) {
        System.out.println("No messages found.");
    }
}
public static void searchMessageById(String id) {

    int index = messageIdArray.indexOf(id);

    if (index != -1) {
        System.out.println("Recipient: " +
                recipientArray.get(index));
        System.out.println("Message: " +
                messageArray.get(index));
    } else {
        System.out.println("Message ID not found.");
    }
}

public static void displaySendersAndRecipients() {
    for (int i = 0; i < senderArray.size(); i++) {
        System.out.println(
            "Sender: " + senderArray.get(i) +
            " | Recipient: " + recipientArray.get(i)
        );
    }
}
public static void storedMessagesMenu() {

    Scanner input = new Scanner(System.in);
    String choice;

    do {
        System.out.println("\n----- STORED MESSAGES -----");
        System.out.println("a. Display sender and recipient of all stored messages");
        System.out.println("b. Display longest stored message");
        System.out.println("c. Search by Message ID");
        System.out.println("d. Search messages by recipient");
        System.out.println("e. Delete message using hash");
        System.out.println("f. Display full stored message report");
        System.out.println("g. Return to Main Menu");

        System.out.print("Enter option: ");
        choice = input.nextLine().toLowerCase();

        switch (choice) {

            case "a":
                displaySendersAndRecipients();
                break;

            case "b":
                displayLongestMessage();
                break;

            case "c":
                System.out.print("Enter Message ID: ");
                String messageId = input.nextLine();
                searchMessageById(messageId);
                break;

            case "d":
                System.out.print("Enter Recipient Number: ");
                String recipient = input.nextLine();
                searchMessagesByRecipient(recipient);
                break;

            case "e":
                System.out.print("Enter Message Hash: ");
                String hash = input.nextLine();
                deleteMessage(hash);
                break;

            case "f":
                displayMessageReport();
                break;

            case "g":
                System.out.println("Returning to Main Menu...");
                break;

            default:
                System.out.println("Invalid option.");
        }

    } while (!choice.equals("g"));
}

    private static void displayLongestMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


