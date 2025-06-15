import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentId;
        boolean isRunning = true;
        StudentDetails studentDetails = new StudentDetails();
        Student student;

        while (isRunning) {
                System.out.println();
                System.out.println("==================================");
                System.out.println(" Student Grade Management System");
                System.out.println("==================================");
            System.out.println("1. Add Student");
            System.out.println("2. Add Subject & Grade to a Student");
            System.out.println("3. View Student Details");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 -> {
                        System.out.println("Add Student");
                        System.out.println("Student ID: ");
                        studentId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Student Name: ");
                        String studentName = scanner.nextLine();
                        student = new Student(studentId, studentName);
                        studentDetails.addStudent(student);
                        System.out.println("Successful Add Student!");
                }
                case 2 -> {
                        System.out.println("Student ID?: ");
                        studentId = scanner.nextInt();
                        scanner.nextLine();

                        student = studentDetails.findStudentById(studentId);

                        if (student != null) {
                            System.out.println("Enter subject name: ");
                            String sub = scanner.nextLine();

                            System.out.println("Enter grade: ");
                            double grade = scanner.nextDouble();

                            Subject subject = new Subject(sub, grade);
                            student.addSubject(subject);

                            System.out.println("Subject/Grade added to " + student.getStudentName());
                        } else {
                            System.out.println("Student not found. Please register first.");
                        }
                }
                case 3 -> {
                        System.out.println("Student ID?: ");
                        studentId = scanner.nextInt();
                        scanner.nextLine();

                        student = studentDetails.findStudentById(studentId);

                        if(student != null) {
                            student.displayStudentDetails();
                        }else {
                            System.out.println("Student not found");
                        }
                }
                case 4 -> {
                        studentDetails.displayInfo();
                }
                case 5 -> {
                        System.out.println("Exit...");
                        isRunning = false;
                }
            }

        }
    }
}