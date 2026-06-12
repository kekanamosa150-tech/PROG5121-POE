/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class storedMessageIT {
    
    public storedMessageIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testDisplayMessageReport() {
        System.out.println("displayMessageReport");
        storedMessage.displayMessageReport();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteMessage() {
        System.out.println("deleteMessage");
        String hash = "";
        storedMessage.deleteMessage(hash);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchMessagesByRecipient() {
        System.out.println("searchMessagesByRecipient");
        String recipient = "";
        storedMessage.searchMessagesByRecipient(recipient);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchMessageById() {
        System.out.println("searchMessageById");
        String id = "";
        storedMessage.searchMessageById(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDisplaySendersAndRecipients() {
        System.out.println("displaySendersAndRecipients");
        storedMessage.displaySendersAndRecipients();
        fail("The test case is a prototype.");
    }

    @Test
    public void testStoredMessagesMenu() {
        System.out.println("storedMessagesMenu");
        storedMessage.storedMessagesMenu();
        fail("The test case is a prototype.");
    }
    
}
