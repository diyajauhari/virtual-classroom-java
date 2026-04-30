// User.java - Base class for all users in the system
public class User {

    // Private fields (Encapsulation: data is hidden from outside)
    private String name;
    private String email;
    private String userId;

    // Constructor: called when a new User object is created
    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    // Getters: allow reading private fields from outside the class
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserId() {
        return userId;
    }

    // Setters: allow updating private fields in a controlled way
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // A method that can be overridden by subclasses (Polymorphism)
    public String getRole() {
        return "User";
    }

    // Display basic info about the user
    public void displayInfo() {
        
        System.out.println("Role    : " + getRole());
        System.out.println("ID      : " + userId);
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
        
    }
}
