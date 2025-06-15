import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;

    private ArrayList<Subject> subjects;

    public Student(int id, String name){
        this.studentId = id;
        this.studentName = name;
        subjects = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void displayStudentDetails() {
        System.out.println("Student: " + getStudentName()+ " " +"(ID: " + getStudentId() + ")");
        System.out.println("Subjects:");
        getAverageGrade();
    }

    public void getAverageGrade() {
        double total = 0.0;
        for (Subject subject : subjects) {
            System.out.println(subject.getSubjectName() +" - "+subject.getGrade());
            total += subject.getGrade();
        }

        double average = total / subjects.size();
        System.out.println("Average Grade: " + average);
    }

}
