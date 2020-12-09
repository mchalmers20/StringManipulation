package javaapplucation;

public class Names {
    private String firstName;
    private String lastName;
    private String occuption;

    public Names(String firstName, String lastName, String occuption) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occuption = occuption;
    }

    @Override
    public String toString() {
        return "Names{" + "firstName=" + firstName + ", lastName=" + lastName + 
                ", occuption=" + occuption + '}';
    }
    
    
    
}
