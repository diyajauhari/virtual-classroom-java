// Assignment.java - Represents an assignment inside a course
public class Assignment {

    // Private fields (Encapsulation)
    private String assignmentId;
    private String title;
    private String description;
    private String dueDate;

    // Constructor
    public Assignment(String assignmentId, String title, String description, String dueDate) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    // Getters
    public String getAssignmentId() {
        return assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    // Setters (in case the teacher wants to update an assignment)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // Display assignment details
    public void displayAssignmentInfo() {
        System.out.println("----------------------------");
        System.out.println("Assignment ID  : " + assignmentId);
        System.out.println("Title          : " + title);
        System.out.println("Description    : " + description);
        System.out.println("Due Date       : " + dueDate);
        System.out.println("----------------------------");
    }
}
