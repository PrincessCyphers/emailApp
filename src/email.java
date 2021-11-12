import java.util.Locale;
import java.util.Scanner;

public class email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int defaultPasswordLength = 12;
    private String department;
    private int mailboxCapacity;
    private String alternativeEmail;
    private String companySuffix = "company.com";

    // Constructor that'll take in firstName and lastName
    public email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // once email created, need a method to call and return the dept
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // once there's name and dept, call a method to return random allocated password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your PASSWORD is " + this.password);

        // putting elements together to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    // ask for dept
    private String setDepartment() {
        System.out.print("Department Codes \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter " + firstName + " " + lastName +"'s department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "Dev";
        } else if (deptChoice == 3) {
            return "Accounting";
        } else {
            return " ";
        }
    }
    // Generate Random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@£$%&*";         // string of char will be treated like array
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand= (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set Alt email
    public void setAlternativeEmail(String altEmail) {
        this.alternativeEmail = altEmail;
    }

    // Change password
    public void changePassword(String password) {
        this.password = password;
    }
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternativeEmail() {return alternativeEmail;}
    public String getPassword() {return "Your password is " + password;}

    public String showInfo(){
        return "Name: " + firstName + " " + lastName + "\nCompany email: " + email + "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}






