package Easy;

import java.util.Stack;

public class ValidParenthese {
    public static void main(String[] args) {
        String testBrackets = "()]";

        if (Validator(testBrackets)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean Validator(String testBrackets) {
        // 條件:
        // 1. 左括號推入stack，遇到右括號則pop top檢查是不是一對
        // 2. stack要為空才行

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < testBrackets.length(); i++) {
            char ch = testBrackets.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // 遇到右括號，且有可能stack已經空了要return false
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}