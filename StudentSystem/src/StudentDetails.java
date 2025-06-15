import java.util.ArrayList;

public class StudentDetails {

    private ArrayList<Student> students;

    public StudentDetails() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    public void displayInfo() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("-----------------------------------");
            System.out.printf("%-15s %-20s%n", "StudentId", "StudentName");
            System.out.println("-----------------------------------");
            for (Student student : students) {
                System.out.printf("%-15s %-20s%n",
                        student.getStudentId(),
                        student.getStudentName());
            }
        }
    }
}
