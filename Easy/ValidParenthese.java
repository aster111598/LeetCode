package Easy;

public class ValidParenthese {
    public static void main(String[] args) {
        String testBrackets = "()";

        if (Validator(testBrackets)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean Validator(String testBrackets) {
        // Check the bracket length is even number or not
        if (testBrackets.length() % 2 != 0) {
            return false;
        }

        return true;
    }
}