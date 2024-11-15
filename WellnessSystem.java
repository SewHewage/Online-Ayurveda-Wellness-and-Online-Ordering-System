package com.Wellness_18ICT005;

import java.util.*;

import java.util.Scanner;

public class WellnessSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu for user selection
        System.out.println("Welcome to the Wellness System!");
        System.out.println("Please choose your account type:");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Wellness Consultant");
        System.out.print("Enter your choice (1/2/3): ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1: // Admin Account
                Admin admin = new Admin("admin@example.com", "987654321");
                System.out.println("Admin account selected.");
                adminMenu(admin, scanner);
                break;

            case 2: // Customer Account
                Customer customer = new Customer(1, "John Doe", "john@example.com", "123456789", "123 Street");
                System.out.println("Customer account selected.");
                customerMenu(customer, scanner);
                break;

            case 3: // Wellness Consultant Account
                WellnessConsultant consultant = new WellnessConsultant(1, "Dr. Smith", "smith@example.com", "555123456");
                System.out.println("Wellness Consultant account selected.");
                consultantMenu(consultant, scanner);
                break;

            default:
                System.out.println("Invalid choice. Exiting...");
        }

        scanner.close();
    }

    // Menu for Admin-specific actions
    public static void adminMenu(Admin admin, Scanner scanner) {
        System.out.println("\nAdmin Menu:");
        System.out.println("1. View Appointments and Orders");
        System.out.println("2. Update Customer Details");
        System.out.println("3. Update Consultant Details");
        System.out.println("4. Update Product Details");
        System.out.println("5. Manage Stock");
        System.out.println("6. Check Feedbacks");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                admin.viewAppointmentsAndOrders();
                break;
            case 2:
                admin.updateCustomerDetails();
                break;
            case 3:
                admin.updateConsultantDetails();
                break;
            case 4:
                admin.updateProductDetails();
                break;
            case 5:
                admin.stockManage();
                break;
            case 6:
                admin.checkFeedbacks();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Menu for Customer-specific actions
    public static void customerMenu(Customer customer, Scanner scanner) {
        System.out.println("\nCustomer Menu:");
        System.out.println("1. View Ayurvedic Products");
        System.out.println("2. Check Consultation Availability");
        System.out.println("3. Make an Appointment");
        System.out.println("4. Buy Ayurvedic Products");
        System.out.println("5. Track Order");
        System.out.println("6. View Orders");
        System.out.println("7. View Appointments");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                customer.viewAyurvedicProducts();
                break;
            case 2:
                customer.checkAvailabilityConsult();
                break;
            case 3:
                customer.makeAppointment();
                break;
            case 4:
                customer.buyAyurvedicProducts();
                break;
            case 5:
                customer.trackingOrder();
                break;
            case 6:
                customer.viewOrder();
                break;
            case 7:
                customer.viewAppointment();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Menu for Wellness Consultant-specific actions
    public static void consultantMenu(WellnessConsultant consultant, Scanner scanner) {
        System.out.println("\nWellness Consultant Menu:");
        System.out.println("1. View Appointments");
        System.out.println("2. Arrange Meetings with Clients");
        System.out.println("3. Create a Treatment");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                consultant.viewAppointment();
                break;
            case 2:
                consultant.arrangeMeetings();
                break;
            case 3:
                consultant.createTreatment();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

