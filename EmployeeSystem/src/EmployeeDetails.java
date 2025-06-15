import java.util.ArrayList;

public class EmployeeDetails {

    private ArrayList<Employee> employees;

    public EmployeeDetails() {
        employees = new ArrayList<>();
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void searchEmployee(int id) {
        boolean found = false;

        for (Employee employee : employees) {
            if(employee.getEmployeeId() == id) {
              System.out.println("Name: " + employee.getEmployeeName());
              employee.displayDetails();
              found = true;
              break;
            }
        }

        if(!found) {
            System.out.println("Employee ID not found!");
        }
    }

    public void employeeList() {
        System.out.println("-- Employee List --");
        if(employees.isEmpty()) {
            System.out.println("No record yet!");
        }else {
            for (Employee employee : employees) {
                System.out.println("ID: " + employee.getEmployeeId()+ "\n" + "Name: " + employee.getEmployeeName());
                employee.displayDetails();
                System.out.println("-------------------------");
                System.out.println();
            }
        }
    }

}
