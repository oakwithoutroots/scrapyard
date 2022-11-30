package models;

public class Author {

// Fields //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private String firstName;
    private String lastName;

// Constructors ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
// Getters and Setters /////////////////////////////////////////////////////////////////////////////////////////////////

   // First Name //

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

  // Last Name //

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
