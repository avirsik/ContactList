import java.util.ArrayList;

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

    }
}
