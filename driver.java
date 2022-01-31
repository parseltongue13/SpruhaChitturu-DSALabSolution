package balancedbrackets;

import java.util.Scanner;
import java.util.Stack;

public class Driver {

    private static boolean checkBracketsBalance(String bracketInput) {
        Stack stack = new Stack();
        for (char c : bracketInput.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character d = (Character) (stack.pop());
                if ((c == '}' && d != '{') || (c == ')' && d != '(') || (c == ']' && d != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brackets String: ");
        String bracketInput = sc.next();
        if (checkBracketsBalance(bracketInput)) {
            System.out.println("The Entered String has Balanced Brackets");
        } else {
            System.out.println("The Entered Strings do not contain Balanced Brackets");
        }
    }
}
