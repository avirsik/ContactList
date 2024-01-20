// Annie Virsik
public class Parent extends Person {
    private String job;

    public Parent (String firstName, String lastName, String phoneNumber, String job) {
        super(firstName, lastName, phoneNumber);
        this.job = job;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString() {
        return super.toString() + " " + this.job;
    }
}
