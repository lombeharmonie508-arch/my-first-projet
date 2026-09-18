import java.util.Scanner;
public class Login {
    String firstName;
    String lastName;

    Scanner sc = new Scanner(System.in);

    void userInput() {
        System.out.print("Please enter your first name:");
        firstName = sc.nextLine();
        System.out.print("Please enter your last name:");
        lastName = sc.nextLine();
    }

    //Method to check the username condition
    boolean checkUserName(String username) {
        while (true) {
            if (username.contains("_") && username.length() <= 6) {
                System.out.print("Username successfully captured");
                break;
            } else {
                System.out.print("Username is not correctly formated; please " +
                        "ensure that " +
                        "your username contains " +
                        "an underscore" +
                        " and is no more than five characters in length");
                username = sc.nextLine();
            }
        }

        return true;
    }

    // Method to check the cellphone number condition
    boolean checkCellPhoneNumber(String phoneNumber) {
        while (true) {
            if (phoneNumber.startsWith("+27") && phoneNumber.length() <= 12) {
                System.out.print(" Cell phone number successfully added");
                break;
            } else {
                System.out.print("Cell phone number incorrectly formatted or does not contain international code");
                phoneNumber = sc.nextLine();
            }
        }
        return true;
    }

    // Method to check the password conditions
    boolean checkPasswordComplexity(String password) {
        while (true) {
            boolean hasNumber = false;
            boolean hasCapital = false;
            boolean specialCharacter = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasNumber = true;
                }
                if (Character.isUpperCase(c)) {
                    hasCapital = true;
                }
                if (!Character.isLetterOrDigit(c)) {
                    specialCharacter = true;
                }
            }
            if (hasNumber && hasCapital && specialCharacter && password.length() >= 8) {
                System.out.print("Password successfully captured");
                return true;
            } else {
                System.out.print("Password is not correctly formatted , " +
                        "please ensure that the password " +
                        "contains at least " +
                        "eight character " +
                        ", a capital letter , a number and a special character");
                password = sc.nextLine();
            }
        }
    }

    // Method to check the login features
    void loginUser(String username2, String password2, String username, String password) {
        while (true) {

            if (username2.equals(username) && password2.equals(password)) {
                System.out.print("-----------------Login Successful-----------------");
                System.out.print("Welcome " + firstName + " " + lastName + " It is great to see you again!");
                break;
            } else {
                System.out.print("Username or password incorrect , please try again:");
                System.out.print("Username: ");
                username2 = sc.nextLine();
                System.out.print("Password: ");
                password2 = sc.nextLine();

            }
        }
    }
}