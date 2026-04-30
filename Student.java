// Student.java - Represents a student user (inherits from User)
import java.util.ArrayList;

public class Student extends User {

    // A student can be enrolled in multiple courses
    private ArrayList<Course> enrolledCourses;

    // Constructor: calls the parent (User) constructor using super()
    public Student(String userId, String name, String email) {
        super(userId, name, email); // Call User's constructor
        this.enrolledCourses = new ArrayList<>();
    }

    // Override getRole() to return "Student" (Polymorphism)
    @Override
    public String getRole() {
        return "Student";
    }

    // Enroll the student in a course
    public void enrollInCourse(Course course) {
        // Check if student is already enrolled
        if (enrolledCourses.contains(course)) {
            System.out.println("You are already enrolled in: " + course.getCourseName());
        } else {
            enrolledCourses.add(course);
            System.out.println(getName() + " successfully enrolled in: " + course.getCourseName());
        }
    }

    // View all courses the student is enrolled in
    public void viewEnrolledCourses() {
        System.out.println("\n=== Enrolled Courses for " + getName() + " ===");
        if (enrolledCourses.isEmpty()) {
            System.out.println("You are not enrolled in any courses yet.");
        } else {
            for (int i = 0; i < enrolledCourses.size(); i++) {
                Course course = enrolledCourses.get(i);
                System.out.println((i + 1) + ". " + course.getCourseName()
                        + " (Taught by: " + course.getTeacherName() + ")");
            }
        }
    }

    // View assignments for a specific course (by course name)
    public void viewAssignmentsForCourse(String courseName) {
        boolean found = false;
        for (Course course : enrolledCourses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                course.displayAssignments();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("You are not enrolled in a course called: " + courseName);
        }
    }

    // Get the list of enrolled courses
    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}
