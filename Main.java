import java.util.Scanner ;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Declarations
    Scanner sc = new Scanner(System.in);
    String username;
    String username2;
    String password;
    String password2;
    String phoneNumber;

    Login userLogin = new Login();
    //Prompting the user first name and surname
    userLogin.userInput();


    //Prompting the username from the user
    System.out.print("Please enter your username:");
    username = sc.nextLine();
    //Checking the conditions for the username
    userLogin.checkUserName(username);
    //Prompting the phone number from the user
    System.out.print("Please enter your phone number:");
    phoneNumber = sc.nextLine();

    //Checking the conditions for the phone number
    userLogin.checkCellPhoneNumber(phoneNumber);
    //Prompting the password from the user
    System.out.print("Please enter your password:");
    password = sc.nextLine();

    //Checking the conditions for the password
    userLogin.checkPasswordComplexity(password);
    System.out.print("------------------Registration Successful-----------------------");
    // Login part
    //Prompting the user for the login information
    System.out.print("Please login your details:");
    System.out.print("Username:");
    username2 = sc.nextLine();
    System.out.print("Password:");
    password2 = sc.nextLine();

    // Checking the conditions for the login
    userLogin.loginUser(username2 , password2 , username , password );
    System.out.print("----------------------Login Successful----------------------");
}