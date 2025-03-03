package tcAssignment;

import java.util.Scanner;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.length() < 5) {
            return false;
        }

        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');

        if (atIndex <= 0 || atIndex != lastAtIndex || atIndex == email.length() - 1) {
            return false;
        }

        int dotIndex = email.indexOf('.', atIndex + 1);

        if (dotIndex == -1 || dotIndex >= email.length() - 2) {
            return false;
        }

        return true;
    }
}
