public class Intern extends Employee{
    private String school;

    public Intern(int employeeId, String employeeName, String school) {
        super(employeeId, employeeName);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
    @Override
    public void displayDetails() {
        System.out.println("Type: Intern" + "\n" + "School: " + this.school);
    }
}
