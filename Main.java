// Main.java - Entry point of the Virtual Classroom System
// This file demonstrates how all classes work together

public class Main {

    public static void main(String[] args) {

        
        System.out.println("   Welcome to Virtual Classroom System  ");
        

     
        //  Teacher

        System.out.println(">>> STEP 1: Creating Teacher...\n");
        Teacher teacher = new Teacher("T001", "Ms. Sarah Johnson", "sarah@school.com");
        teacher.displayInfo(); // Uses polymorphism: calls Teacher's getRole()

        
        // Teacher creates courses
        /
        System.out.println("\n>>> STEP 2: Teacher is creating courses...\n");
        Course javaCourse = teacher.createCourse("C101", "Java Programming");
        Course mathCourse = teacher.createCourse("C102", "Mathematics 101");

        // Show all courses the teacher created
        teacher.viewCreatedCourses();

      
        //  Teacher adds assignments to a course
       
        System.out.println("\n>>> STEP 3: Teacher is adding assignments...\n");

        // Create assignments for the Java course
        Assignment a1 = new Assignment("A001", "Hello World Program",
                "Write a program that prints Hello World", "2025-05-10");

        Assignment a2 = new Assignment("A002", "OOP Concepts Report",
                "Write a short report on Inheritance, Encapsulation, and Polymorphism",
                "2025-05-20");

        // Create an assignment for the Math course
        Assignment a3 = new Assignment("A003", "Algebra Worksheet",
                "Solve all problems on pages 45-48 of the textbook", "2025-05-15");

        // Add assignments using the teacher method
        teacher.addAssignmentToCourse("Java Programming", a1);
        teacher.addAssignmentToCourse("Java Programming", a2);
        teacher.addAssignmentToCourse("Mathematics 101", a3);

      
        // Create Students
       
        System.out.println("\n>>> STEP 4: Creating Students...\n");
        Student student1 = new Student("S001", "Alice Smith", "alice@school.com");
        Student student2 = new Student("S002", "Bob Lee", "bob@school.com");

        student1.displayInfo(); // Uses polymorphism: calls Student's getRole()
        student2.displayInfo();

        
        //  Students enroll in courses
       
        System.out.println("\n>>> STEP 5: Students enrolling in courses...\n");

        // Alice enrolls in both courses
        student1.enrollInCourse(javaCourse);
        student1.enrollInCourse(mathCourse);

        // Bob only enrolls in the Java course
        student2.enrollInCourse(javaCourse);

        // Try enrolling Alice in Java again (should show already enrolled message)
        student1.enrollInCourse(javaCourse);

        
        // Students view their enrolled courses
       
        System.out.println();
        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        //  Students view assignments for a course
        System.out.println("\n>>> STEP 7: Viewing assignments for courses...\n");

        // Alice views assignments for Java Programming
        student1.viewAssignmentsForCourse("Java Programming");

        // Alice views assignments for Mathematics 101
        student1.viewAssignmentsForCourse("Mathematics 101");

        // Bob views assignments for Java Programming
        student2.viewAssignmentsForCourse("Java Programming");

        // Bob tries to view assignments for a course he's NOT enrolled in
        System.out.println();
        student2.viewAssignmentsForCourse("Mathematics 101");

        
        // STEP 8: View course details
        System.out.println("\n>>> STEP 8: Course Details...\n");
        javaCourse.displayCourseInfo();
        mathCourse.displayCourseInfo();

      
        System.out.println("        Program Finished. Goodbye!      ");
      
    }
}
