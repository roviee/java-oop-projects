public class RegularEmployee extends Employee{
    private int salary;
    public RegularEmployee(int employeeId, String employeeName, int salary) {
        super(employeeId, employeeName);
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Type: Regular Employee" + "\n" + "Salary: " + this.salary);
    }
}
