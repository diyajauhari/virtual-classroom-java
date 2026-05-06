public class Main {
    public static void main(String[] args) {

        System.out.println("=== Virtual Classroom System ===\n");

        Teacher teacher = new Teacher("T001", "Ms. Sarah Johnson", "sarah@school.com");
        teacher.displayInfo();

        Course javaCourse = teacher.createCourse("C101", "Java Programming");
        Course mathCourse = teacher.createCourse("C102", "Mathematics 101");
        teacher.viewCreatedCourses();

        Assignment a1 = new Assignment("A001", "Hello World Program", "Print Hello World", "2025-05-10");
        Assignment a2 = new Assignment("A002", "OOP Report", "Write about Inheritance and Polymorphism", "2025-05-20");
        Assignment a3 = new Assignment("A003", "Algebra Worksheet", "Solve pages 45-48", "2025-05-15");

        teacher.addAssignmentToCourse("Java Programming", a1);
        teacher.addAssignmentToCourse("Java Programming", a2);
        teacher.addAssignmentToCourse("Mathematics 101", a3);

        Student student1 = new Student("S001", "Alice Smith", "alice@school.com");
        Student student2 = new Student("S002", "Bob Lee", "bob@school.com");
        student1.displayInfo();
        student2.displayInfo();

        student1.enrollInCourse(javaCourse);
        student1.enrollInCourse(mathCourse);
        student2.enrollInCourse(javaCourse);
        student1.enrollInCourse(javaCourse);

        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        student1.viewAssignmentsForCourse("Java Programming");
        student1.viewAssignmentsForCourse("Mathematics 101");
        student2.viewAssignmentsForCourse("Java Programming");
        student2.viewAssignmentsForCourse("Mathematics 101");

        javaCourse.displayCourseInfo();
        mathCourse.displayCourseInfo();

        System.out.println("\n=== Program Finished. Goodbye! ===");
    }
}
