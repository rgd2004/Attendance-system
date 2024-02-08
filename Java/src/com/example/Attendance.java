package src.com.example;

public class Attendance {
    public static void main(String[] args) {
        Database db = new Database("attendance.db");

        // Example usage
        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(2, "Jane Smith");

        db.insertStudent(student1);
        db.insertStudent(student2);

        db.close();
    }
}
