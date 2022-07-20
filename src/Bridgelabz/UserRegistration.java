package Bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome in user registration program");
        UserRegistration user = new UserRegistration();
        user.firstname();
    }
    public boolean firstname(){
        System.out.println("Enter First Name: ");
        String name = sc.next();
        boolean valid = name.matches("^[A-Z][a-z]{2,}");
        System.out.println("First Name is: "+name +"\nvalid: " + valid);
        return valid;

    }
    public boolean lastname(){
        System.out.println("Enter Last Name: ");
        String name = sc.next();
        boolean valid = name.matches("^[A-Z][a-z]{3,}");
        System.out.println("Last Name is: "+name +"\nvalid: " + valid);
        return valid;
    }
}
