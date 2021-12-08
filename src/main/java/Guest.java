public class Guest {
    private String firstName = null;
    private String lastName = null;
    private int age = 0;

    public Guest(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getInfoGuest() {
        return String.format("Dodano nowego gościa: %s %s (wiek: %d) ", getFirstName(), getLastName(), getAge());
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
