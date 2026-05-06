// Course.java - Represents a course in the virtual classroom
import java.util.ArrayList;

public class Course {

    // Private fields (Encapsulation)
    private String courseId;
    private String courseName;
    private String teacherName;       // Name of the teacher who created the course
    private ArrayList<Assignment> assignments; // List of assignments for this course

    // Constructor
    public Course(String courseId, String courseName, String teacherName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.assignments = new ArrayList<>();
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    // Add an assignment to this course
    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    // Display all assignments for this course
    public void displayAssignments() {
        System.out.println("\n=== Assignments for Course: " + courseName + " ===");
        if (assignments.isEmpty()) {
            System.out.println("No assignments added yet.");
        } else {
            for (int i = 0; i < assignments.size(); i++) {
                Assignment a = assignments.get(i);
                System.out.println((i + 1) + ". " + a.getTitle());
                System.out.println("   Description : " + a.getDescription());
                System.out.println("   Due Date    : " + a.getDueDate());
            }
        }
    }

    // Display a short summary of the course
    public void displayCourseInfo() {
        System.out.println("----------------------------");
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Teacher     : " + teacherName);
        System.out.println("Assignments : " + assignments.size());
        System.out.println("----------------------------");
    }
}
