/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

import java.util.Scanner;

/**
 *
 * @author Student
 */

  class Login{

    private String userName;
    private String passWord;
    private String phoneNumber;

    // Username validation
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Password validation (NO regex)
    public boolean checkPassword(String password) {

        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasNumber && hasSpecial;
    }

    // Cell phone validation (NO regex)
    public boolean checkPhone(String phone) {

        if (!phone.startsWith("+27")) return false;
        if (phone.length() != 12) return false;

        for (int i = 3; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    // Registration method
    public void register(Scanner obj) {

        System.out.println("=== REGISTER ===");

        System.out.print("Enter username: ");
        String username = obj.nextLine();

        if (checkUserName(username)) {
            System.out.println("Username successfully passed.");
            String userName = username;
        } else {
            System.out.println("Username is invalid .");
            return; // cancel if invalid
        }

        System.out.print("Enter password: ");
        String password = obj.nextLine();

        if (checkPassword(password)) {
            System.out.println("Password successfully passed.");
            passWord = password;
        } else {
            System.out.println("Password is invalid.");
            return;
        }

        System.out.print("Enter cellphone (+27...): ");
        String phone = obj.nextLine();

        if (checkPhone(phone)) {
            System.out.println("Cellphone number passed.");
            phoneNumber = phone;
        } else {
            System.out.println("Cellphone number invalid.");
            return;
        }

        System.out.println("Registration successful!\n");
    }

    // Login method
    public void login(Scanner obj) {

        System.out.println("=== LOGIN ===");

        System.out.print("Enter username: ");
        String username = obj.nextLine();

        System.out.print("Enter password: ");
        String password = obj.nextLine();

        if (username.equals(userName) && password.equals(passWord)) {
            System.out.println("Welcome back! Login successful.");
        } else {
            System.out.println("Username or password invalid, please try again.");
        }
    }
}

   public class Registration {
    public static void main(String[] args) {

        try (Scanner obj = new Scanner(System.in)) {
            Login user = new Login();
            
            int choice;
            
            do {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Choose option: ");
                
                choice = obj.nextInt();
                obj.nextLine(); // FIX for Scanner (important!)
                
                switch (choice) {
                    case 1 -> user.register(obj);
                        
                    case 2 -> user.login(obj);
                        
                    case 3 -> System.out.println("bye bye!");
                        
                    default -> System.out.println("Invalid choice.");
                }
                
            } while (choice != 3);
        }
    }
}
