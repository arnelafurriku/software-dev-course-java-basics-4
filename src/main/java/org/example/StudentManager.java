package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private List<String> students = new ArrayList<>();

    public void mainMenu() {
        System.out.println("\nWelcome to the student manager!");
        System.out.println("1. Add student");
        System.out.println("2. Remove student");
        System.out.println("3. View all students");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            addStudent();
        } else if (choice.equals("2")) {
            removeStudent();
        } else if (choice.equals("3")) {
            viewStudents();
        } else if (choice.equals("4")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please try again.");
            mainMenu();
        }
    }

    public void addStudent() {
        System.out.print("Enter the new student's name: ");
        String studentName = scanner.nextLine();

        students.add(studentName);
        System.out.println(studentName + " added.");

        mainMenu();
    }

    public void removeStudent() {
        System.out.print("Enter the student's name to remove: ");
        String studentName = scanner.nextLine();

        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " removed.");
        } else {
            System.out.println("Student not found.");
        }

        mainMenu();
    }

    public void viewStudents() {
        System.out.println("\nStudents:");

        if (students.isEmpty()) {
            System.out.println("(No students yet)");
        } else {
            for (String student : students) {
                System.out.println("- " + student);
            }
        }

        mainMenu();
    }
}
