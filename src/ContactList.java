/*
By Annie Virsik
1/19/24
Contact List - Using inheritance to store names and phone numbers of contacts.
The user can add, list, and search for a specific contact.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<Person> contacts;

    public ContactList() {
        contacts = new ArrayList<Person>();
    }

    // Returns ArrayList contacts
    public ArrayList<Person> getContacts() {
        return this.contacts;
    }

    // Adds a contact to the list
    public void addContacts(Person p) {
        contacts.add(p);
    }

    // Prints out all the contacts in the list
    public void printContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i).toString());
        }
        if (contacts.size() == 0) {
            System.out.println("There are no contacts yet.");
        }
    }

    // Sorts contacts by person's first name, last name, or phone #
    public void sort(int sortBy) {
        int n = contacts.size();
        for (int pass = 0; pass < n-1; pass++) {
            for (int j = 0; j < n-1-pass; j++) {
                if (sortBy == 0) {
                    if (contacts.get(j).getFirstName().compareTo(contacts.get(j+1).getFirstName()) > 0) {
                        Person temp = contacts.get(j);
                        contacts.set(j, contacts.get(j+1));
                        contacts.set(j+1, temp);
                    }
                }
                else if (sortBy == 1) {
                    if (contacts.get(j).getLastName().compareTo(contacts.get(j+1).getLastName()) > 0) {
                        Person temp = contacts.get(j);
                        contacts.set(j, contacts.get(j+1));
                        contacts.set(j+1, temp);
                    }
                }
                else if (sortBy == 2) {
                    if (contacts.get(j).getPhoneNumber().compareTo(contacts.get(j+1).getPhoneNumber()) > 0) {
                        Person temp = contacts.get(j);
                        contacts.set(j, contacts.get(j+1));
                        contacts.set(j+1, temp);
                    }
                }
            }
        }
    }

    // Returns the contact with that first name
    public Person searchByFirstName(String firstName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(firstName)) {
                return contacts.get(i);
            }
            else if (contacts.isEmpty()) {
                return null;
            }
        }
        return null;
    }

    // Returns the contact with that last name
    public Person searchByLastName(String lastName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getLastName().equals(lastName)) {
                return contacts.get(i);
            }
            else if (contacts.isEmpty()) {
                return null;
            }
        }
        return null;
    }

    // Returns the contact with that phone number
    public Person searchByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                return contacts.get(i);
            }
            else if (contacts.isEmpty()) {
                return null;
            }
        }
        return null;
    }

    // Prints out all the students
    public void listStudents() {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i) instanceof Student) {
                System.out.println(contacts.get(i).toString());
            }
        }
    }

    // Runs the user instructions and commands
    public void run() {
        System.out.println("1. Add Contact\n" +
                "2. List All Contacts By First Name\n" +
                "3. List All Contacts By Last Name\n" +
                "4. List All Contacts By Phone Number\n" +
                "5. List All Students\n" +
                "6. Search By First Name\n" +
                "7. Search By Last Name\n" +
                "8. Search By Phone Number\n" +
                "0. Exit\n\n" +
                "What would you like to do?");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num != 0) {
            if (num == 1) {
                System.out.println("Type in which type of Person to add:\n1. Student (s)\n2. Parent (p)");
                scan.nextLine();
                String type = scan.nextLine();
                System.out.println("Enter a Name: ");
                String name = scan.nextLine();
                System.out.println("Enter a last Name: ");
                String lastName = scan.nextLine();
                System.out.println("Enter a phone number: #");
                String phoneNum = scan.nextLine();
                // Adds grade or job depending on the type of person
                if (type.equals("s")) {
                    System.out.println("Enter a grade level: ");
                    int grade = scan.nextInt();
                    // Creates a new person and adds it to contacts
                    Student s = new Student(name, lastName, phoneNum, grade);
                    contacts.add(s);
                }
                // Adds grade or job depending on the type of person
                if (type.equals("p")) {
                    System.out.println("Enter a job: ");
                    String job = scan.nextLine();
                    // Creates a new person and adds it to contacts
                    Parent p = new Parent(name, lastName, phoneNum, job);
                    contacts.add(p);
                }
                System.out.println("The contact is added to the list!");
                System.out.println("\nWhat would you like to do?");
                // Scans the next order the user puts in
                num = scan.nextInt();
            }
            else if (num == 2) {
                sort(0);
                printContacts();
                // Scans the next order the user puts in
                System.out.println("\nWhat would you like to do?");
                num = scan.nextInt();
            }
            else if (num == 3) {
                sort(1);
                printContacts();
                // Scans the next order the user puts in
                System.out.println("\nWhat would you like to do?");
                num = scan.nextInt();
            }
            else if (num == 4) {
                sort(2);
                printContacts();
                // Scans the next order the user puts in
                System.out.println("\nWhat would you like to do?");
                num = scan.nextInt();
            }
            else if (num == 5) {
                printContacts();
                // Scans the next order the user puts in
                System.out.println("\nWhat would you like to do?");
                num = scan.nextInt();
            }
            else if (num == 6) {
                System.out.println("Enter a First Name: ");
                scan.nextLine();
                String firstName = scan.nextLine();
                if (searchByFirstName(firstName) == null) {
                    System.out.println(firstName + " is not in the list.");
                }
                else {
                    System.out.println("This is your contact: " + searchByFirstName(firstName).toString());
                }
                // Scans the next order the user puts in
                System.out.println("\nWhat would you like to do?");
                num = scan.nextInt();
            }
            else if (num == 7) {
                System.out.println("Enter a Last Name: ");
                scan.nextLine();
                String lastName = scan.nextLine();
                if (searchByLastName(lastName) == null) {
                    System.out.println(lastName + " is not in the list.");
                }
                else {
                    System.out.println("This is your contact: " + searchByLastName(lastName).toString());
                }
                // Scans the next order the user puts in
                System.out.println("\nWhat would you like to do?");
                num = scan.nextInt();
            }
            else if (num == 8) {
                System.out.println("Enter a Phone Number: ");
                scan.nextLine();
                String phoneNum = scan.nextLine();
                if (searchByPhoneNumber(phoneNum) == null) {
                    System.out.println(phoneNum + " is not in the list.");
                }
                else {
                    System.out.println("This is your contact: " + searchByPhoneNumber(phoneNum).toString());
                }
                // Scans the next order the user puts in
                System.out.println("\nWhat would you like to do?");
                num = scan.nextInt();
            }
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        ContactList c = new ContactList();
        c.run();
    }
}
