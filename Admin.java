package com.Wellness_18ICT005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    private String email;
    private String phoneNumber;
    private List<String> appointments;
    private List<String> orders;
    private List<String> feedbacks;
    private List<String> products;

    // Constructor
    public Admin(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.appointments = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.feedbacks = new ArrayList<>();
        this.products = new ArrayList<>();

        // Adding dummy data
        appointments.add("Appointment with John Doe at 10:00 AM on 2024-11-16");
        orders.add("Order #12345 - Ayurvedic Oil");
        feedbacks.add("Great consultation experience!");
        products.add("Ayurvedic Oil");
        products.add("Herbal Tea");
    }

    // View appointments and orders
    public void viewAppointmentsAndOrders() {
        System.out.println("\nAppointments:");
        for (String appointment : appointments) {
            System.out.println("- " + appointment);
        }

        System.out.println("\nOrders:");
        for (String order : orders) {
            System.out.println("- " + order);
        }
    }

    // Update customer details (user input)
    public void updateCustomerDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the updated customer details:");
        String updatedDetails = scanner.nextLine();
        appointments.add(updatedDetails);
        System.out.println("Customer details updated successfully.");
        System.out.println("Updated Appointments:");
        for (String appointment : appointments) {
            System.out.println("- " + appointment);
        }
    }

    // Update consultant details (user input)
    public void updateConsultantDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the updated consultant details:");
        String updatedDetails = scanner.nextLine();
        orders.add(updatedDetails);
        System.out.println("Consultant details updated successfully.");
        System.out.println("Updated Orders:");
        for (String order : orders) {
            System.out.println("- " + order);
        }
    }

    // Update product details (user input)
    public void updateProductDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCurrent Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
        System.out.println("\nEnter the name of the new product to add:");
        String newProduct = scanner.nextLine();
        products.add(newProduct);
        System.out.println("Product list updated successfully.");
        System.out.println("Updated Products:");
        for (String product : products) {
            System.out.println("- " + product);
        }
    }

    // Manage stock
    public void stockManage() {
        System.out.println("\nManaging stock...");
        System.out.println("Stock levels are sufficient for all products.");
    }

    // Check feedbacks
    public void checkFeedbacks() {
        System.out.println("\nCustomer Feedbacks:");
        for (String feedback : feedbacks) {
            System.out.println("- " + feedback);
        }
    }

    public static void main(String[] args) {
        Admin admin = new Admin("admin@wellness.com", "123-456-7890");

        // Example usage
        admin.viewAppointmentsAndOrders();
        admin.updateCustomerDetails();
        admin.updateConsultantDetails();
        admin.updateProductDetails();
        admin.checkFeedbacks();
        admin.stockManage();
    }
}
