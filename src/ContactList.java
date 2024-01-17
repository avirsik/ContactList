import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<Person> contacts;

    public ContactList() {
        contacts = new ArrayList<Person>();
    }

    public ArrayList<Person> getContacts() {
        return this.contacts;
    }

    // Adds a contact to the list
    public void addContacts(Person p) {
        contacts.add(p);
    }

    // Prints out all the contacts in the list
    public String printContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            return contacts.get(i).toString();
        }
        return "";
    }

    // Sorts contacts by person's first name, last name, or phone #
    // ?
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

    public Person searchByFirstName(String firstName) {

    }

    public Person searchByLastName(String lastName) {

    }

    public Person searchByPhoneNumber(String phoneNumber) {

    }

    // ?
    public boolean listStudents() {

    }

    // need while loop here
    public void run() {
        System.out.println("1. Add Contact\n" +
                "2. List All Contacts By First Name\n" +
                "3. List All Contacts By Last Name\n" +
                "4. List All Contacts By Phone Number\n" +
                "5. List All Students\n" +
                "6. Search By First Name\n" +
                "7. Search By Last Name\n" +
                "8. Search By Phone Number\n" +
                "0. Exit\n");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num == 1) {
            System.out.println("Enter a Name: ");
            String name = scan.nextLine();
            contacts.addContacts(name);
        }
        else if (num == 2) {
            contacts.sort(0);
            contacts.printContacts();
        }
        else if (num == 3) {
            contacts.sort(1);
            contacts.printContacts();
        }
        else if (num == 4) {
            contacts.sort(2);
            contacts.printContacts();
        }
        else if (num == 5) {
            contacts.printContacts();
        }
        else if (num == 6) {
            System.out.println("Enter a First Name: ");
            String firstName = scan.nextLine();
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).equals(firstName) {
                    break;
                }
            }
        }
        else if (num == 7) {

        }
        else if (num == 8) {

        }
        else if (num == 0) {

        }
    }
}
