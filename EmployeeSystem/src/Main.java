import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Employee employee;
        EmployeeDetails employeeDetails = new EmployeeDetails();

        int employeeId;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println();
            System.out.println("===============================");
            System.out.println(" Employee Management System");
            System.out.println("=============================== ");

            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("-- Add New Employee --");
                    System.out.print("Enter Employee ID: ");
                    employeeId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String employeeName = scanner.nextLine();

                    employeeType();

                    System.out.print("Choice: ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    if (type == 1) {
                        System.out.print("Enter School: ");
                        String school = scanner.nextLine();
                        employee = new Intern(employeeId,employeeName,school);
                        employeeDetails.addEmployee(employee);
                    } else if (type == 2) {
                        System.out.print("Enter Salary: ");
                        int salary = scanner.nextInt();
                        employee = new RegularEmployee(employeeId,employeeName,salary);
                        employeeDetails.addEmployee(employee);
                    } else if (type == 3) {
                        System.out.print("Enter Department: ");
                        String dept = scanner.nextLine();
                        employee = new Manager(employeeId,employeeName,dept);
                        employeeDetails.addEmployee(employee);
                    }

                    System.out.println("Employee added successfully!");
                }

                case 2 -> {
                    employeeDetails.employeeList();
                }
                case 3 -> {
                    System.out.println("-- Search Employee --");
                    System.out.print("Enter Employee ID: ");
                    employeeId = scanner.nextInt();
                    employeeDetails.searchEmployee(employeeId);
                }
                case 4 -> {
                    System.out.println("Exit...");
                    isRunning = false;
                }
            }
        }
    }

    static void employeeType() {
        System.out.println("Select Employee Type");
        System.out.println("1. Intern");
        System.out.println("2. Regular Employee");
        System.out.println("3. Manager");
    }
}