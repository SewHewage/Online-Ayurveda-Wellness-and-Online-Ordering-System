package com.Wellness_18ICT005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private int customerId;
    private String customerName;
    private String email;
    private String phoneNumber;
    private String address;
    private List<String> products;
    private List<String> appointments;
    private List<String> orders;

    // Constructor
    public Customer(int customerId, String customerName, String email, String phoneNumber, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;

        // Initializing dummy data
        this.products = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.orders = new ArrayList<>();

        products.add("Ayurvedic Oil");
        products.add("Herbal Tea");
        products.add("Natural Shampoo");

        orders.add("Order #001: Ayurvedic Oil - Delivered");
        orders.add("Order #002: Herbal Tea - Shipped");
    }

    // View Ayurvedic products
    public void viewAyurvedicProducts() {
        System.out.println("\nAvailable Ayurvedic Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
    }

    // Buy Ayurvedic products with selection
    public void buyAyurvedicProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAvailable Ayurvedic Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
        System.out.println("\nEnter the number of the product you want to buy:");
        int productChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (productChoice > 0 && productChoice <= products.size()) {
            String selectedProduct = products.get(productChoice - 1);
            orders.add("Order #00" + (orders.size() + 1) + ": " + selectedProduct + " - Pending");
            System.out.println("Product added to your orders successfully: " + selectedProduct);
        } else {
            System.out.println("Invalid product choice. Please try again.");
        }
    }

    // Track an order
    public void trackingOrder() {
        System.out.println("\nTracking orders...");
        for (String order : orders) {
            System.out.println("- " + order);
        }
    }

    // View orders
    public void viewOrder() {
        System.out.println("\nViewing all orders...");
        for (String order : orders) {
            System.out.println("- " + order);
        }
    }

    // View appointments
    public void viewAppointment() {
        System.out.println("\nViewing appointments...");
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            for (String appointment : appointments) {
                System.out.println("- " + appointment);
            }
        }
    }

    // Main menu with user input
    public void startCustomerMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean continueMenu = true;

        while (continueMenu) {
            System.out.println("\n===== Customer Menu =====");
            System.out.println("1. View Ayurvedic Products");
            System.out.println("2. Check Consultation Availability");
            System.out.println("3. Make an Appointment");
            System.out.println("4. Buy Ayurvedic Products");
            System.out.println("5. Track Orders");
            System.out.println("6. View Orders");
            System.out.println("7. View Appointments");
            System.out.println("8. Back to Main Menu");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    viewAyurvedicProducts();
                    break;
                case 2:
                    checkAvailabilityConsult();
                    break;
                case 3:
                    makeAppointment();
                    break;
                case 4:
                    buyAyurvedicProducts();
                    break;
                case 5:
                    trackingOrder();
                    break;
                case 6:
                    viewOrder();
                    break;
                case 7:
                    viewAppointment();
                    break;
                case 8:
                    System.out.println("Returning to the Main Menu...");
                    return; // Exit the customer menu to the main menu
                case 9:
                    System.out.println("Exiting Customer Menu. Thank you!");
                    continueMenu = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            if (continueMenu) {
                System.out.println("\nDo you want to continue in Customer Menu? (yes/no): ");
                String continueResponse = scanner.nextLine();
                if (!continueResponse.equalsIgnoreCase("yes")) {
                    System.out.println("Exiting Customer Menu. Thank you!");
                    continueMenu = false;
                }
            }
        }

        scanner.close();
    }
 // Check consultation availability
    public void checkAvailabilityConsult() {
        System.out.println("\nChecking consultation availability...");
        System.out.println("Consultations available on 2024-11-20 at 10:00 AM.");
    }

    // Make an appointment (user input)
    public void makeAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter details for your appointment (e.g., 'Appointment with Consultant on 2024-11-20 at 10:00 AM'):");
        String appointmentDetails = scanner.nextLine();
        appointments.add(appointmentDetails);
        System.out.println("Appointment successfully booked.");
        System.out.println("\nUpdated Appointments:");
        for (String appointment : appointments) {
            System.out.println("- " + appointment);
        }
    }


}
