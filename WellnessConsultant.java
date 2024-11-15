package com.Wellness_18ICT005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WellnessConsultant {
    private int consultantId;
    private String consultantName;
    private String email;
    private String phoneNumber;
    private List<String> appointments;
    private List<String> meetings;
    private List<String> treatments;

    // Constructor
    public WellnessConsultant(int consultantId, String consultantName, String email, String phoneNumber) {
        this.consultantId = consultantId;
        this.consultantName = consultantName;
        this.email = email;
        this.phoneNumber = phoneNumber;

        // Initializing dummy data
        this.appointments = new ArrayList<>();
        this.meetings = new ArrayList<>();
        this.treatments = new ArrayList<>();

        appointments.add("Appointment with John Doe at 10:00 AM on 2024-11-20");
        meetings.add("Meeting with Client A at 2:00 PM on 2024-11-20");
    }

    // View appointments
    public void viewAppointment() {
        System.out.println("\nViewing appointments...");
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (String appointment : appointments) {
                System.out.println("- " + appointment);
            }
        }
    }

    // Arrange meetings (user input)
    public void arrangeMeetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter details for the new meeting (e.g., 'Meeting with Client X at 3:00 PM on 2024-11-25'):");
        String newMeeting = scanner.nextLine();
        meetings.add(newMeeting);
        System.out.println("New meeting scheduled successfully.");
        System.out.println("\nUpdated Meetings:");
        for (String meeting : meetings) {
            System.out.println("- " + meeting);
        }
    }

    // Create treatments (user input)
    public void createTreatment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter details for the new treatment (e.g., 'Relaxation Therapy: 60-minute massage with essential oils'):");
        String newTreatment = scanner.nextLine();
        treatments.add(newTreatment);
        System.out.println("New treatment created successfully.");
        System.out.println("\nUpdated Treatments:");
        for (String treatment : treatments) {
            System.out.println("- " + treatment);
        }
    }

    // Display all scheduled meetings
    public void viewMeetings() {
        System.out.println("\nViewing all meetings...");
        if (meetings.isEmpty()) {
            System.out.println("No meetings scheduled.");
        } else {
            for (String meeting : meetings) {
                System.out.println("- " + meeting);
            }
        }
    }

    // Display all treatments
    public void viewTreatments() {
        System.out.println("\nViewing available treatments...");
        if (treatments.isEmpty()) {
            System.out.println("No treatments available.");
        } else {
            for (String treatment : treatments) {
                System.out.println("- " + treatment);
            }
        }
    }

    public static void main(String[] args) {
        WellnessConsultant consultant = new WellnessConsultant(1, "Dr. Smith", "dr.smith@wellness.com", "123-456-7890");

        // Example usage
        consultant.viewAppointment();
        consultant.arrangeMeetings();
        consultant.createTreatment();
        consultant.viewMeetings();
        consultant.viewTreatments();
    }
}
