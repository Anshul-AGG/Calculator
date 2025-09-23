package CRUD;

import java.util.ArrayList;

public class StudentCrud {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Alice", 85.5));
        students.add(new Student(2, "Bob", 90.0));
        students.add(new Student(3, "Charlie", 78.0));
        System.out.println("Initial Students: " + students);
        System.out.println();

        // Create
        students.add(new Student(4, "David", 88.0));
        System.out.println("After Adding David: " + students);
        System.out.println();

        // Read
        Student student = students.get(1); // Get Bob
        System.out.println("Read Student: " + student);
        System.out.println();

        // Update
        student.setMarks(92.0); // Update Bob's marks
        System.out.println("After Updating Bob's Marks: " + students);
        System.out.println();
        
        // Delete
        students.remove(0); // Remove Alice
        System.out.println("After Removing Alice: " + students);
        System.out.println();
    }
}
