// Teacher.java - Represents a teacher user (inherits from User)
import java.util.ArrayList;

public class Teacher extends User {

    // A teacher can create and manage multiple courses
    private ArrayList<Course> createdCourses;

    // Constructor: calls the parent (User) constructor using super()
    public Teacher(String userId, String name, String email) {
        super(userId, name, email); // Call User's constructor
        this.createdCourses = new ArrayList<>();
    }

    // Override getRole() to return "Teacher" (Polymorphism)
    @Override
    public String getRole() {
        return "Teacher";
    }

    // Create a new course and add it to the teacher's course list
    public Course createCourse(String courseId, String courseName) {
        Course newCourse = new Course(courseId, courseName, getName());
        createdCourses.add(newCourse);
        System.out.println("Course created: " + courseName + " (ID: " + courseId + ")");
        return newCourse;
    }

    // Add an assignment to an existing course (by course name)
    public void addAssignmentToCourse(String courseName, Assignment assignment) {
        boolean found = false;
        for (Course course : createdCourses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                course.addAssignment(assignment);
                System.out.println("Assignment \"" + assignment.getTitle()
                        + "\" added to course: " + courseName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Course not found: " + courseName);
        }
    }

    // View all courses created by this teacher
    public void viewCreatedCourses() {
        System.out.println("\n=== Courses Created by " + getName() + " ===");
        if (createdCourses.isEmpty()) {
            System.out.println("No courses created yet.");
        } else {
            for (int i = 0; i < createdCourses.size(); i++) {
                Course course = createdCourses.get(i);
                System.out.println((i + 1) + ". " + course.getCourseName()
                        + " (ID: " + course.getCourseId() + ")");
            }
        }
    }

    // Get the list of created courses
    public ArrayList<Course> getCreatedCourses() {
        return createdCourses;
    }
}
