public class Guest {
    private String firstName = null;
    private String lastName = null;
    private int age = 0;
    private Gender sexType;

    public Guest(String firstName, String lastName, int age, Gender sexType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sexType = sexType;
    }
    public String getInfo() {
        return String.format("Dodano nowego gościa: %s %s (wiek: %d) (płeć: %s)", this.firstName, this.lastName, this.age, this.sexType);
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
