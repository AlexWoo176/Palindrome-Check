import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckUsingStack {
    public static void main(String[] args) {
        System.out.print("Enter any String: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Stack stack = new Stack();

        for (int i = 0; i < inputString.length() ; i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseStringResult = "";

        while (!stack.isEmpty()) {
            reverseStringResult = reverseStringResult + stack.pop();
        }

        if (inputString.equals(reverseStringResult))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }
}
