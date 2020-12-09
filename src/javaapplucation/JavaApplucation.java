package javaapplucation;
//Create a program which makes use of some of the methods:
//.toLowerCase()
//.toUpperCase()
//.equals()
//.equalsIgnoreCase()
//.trim()
//.charAt()
//.concat()
//.length()

//Consider using a username (use .equalsCaseIgnore) and password-
//-(use .equals), if the user logs in successfully the print out the final-
//-variables, first name, first initial and surname.
import java.util.Scanner;
public class JavaApplucation {
    static Scanner string_input = new Scanner(System.in);
    public static void main(String[] args){
        String username;
        String password;
        
        System.out.println("Hi, please enter the username");
        username = string_input.next();
        String username1 = username.toLowerCase();
        if(username1.equals("christmas")){
            System.out.println("Username correct. Please enter password");
            
            password = string_input.next();
            String password1 = password.toUpperCase();
            if(password1.equals("JINGLEBELLS")) {
                System.out.println("Password correct.");
                System.out.println("You have granted access to the "
                        + "files you have requested.");
                Names n = new Names("Tony", "Stark", "Avenger");
                System.out.println(n);
            }
            else{
                System.out.println("Login unsuccessful");        
            }                       
        }
        else{
            System.out.println("Username incorrect");
        }
    } 
}
