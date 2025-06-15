public class Manager extends Employee{
    private String department;

    public Manager(int employeeId, String employeeName, String department) {
        super(employeeId, employeeName);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Type: Manager" + "\n" + "Department: " + this.department);
    }
}
