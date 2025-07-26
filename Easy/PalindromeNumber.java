package Easy;
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        String originStr = new String();
        String reverseStr = new String();
        // boolean ans = false;
        // int轉String
        originStr = Integer.toString(x);
        // String反轉
        for (int i = 0; i < originStr.length(); i++) {
            // 取1 => 1
            // 取2 => 21
            // 取0 => 021
            reverseStr = originStr.charAt(i) + reverseStr;
        }

        for (int i = 0; i < originStr.length(); i++) {
            if (originStr.charAt(i) != reverseStr.charAt(i)) {
                // System.out.println("false");
                // ans = false;
                break;
            }
            // 檢查到最後一個
            if (i == originStr.length() - 1) {
                // System.out.println("true");
                // ans = true;
            }
        }
        // return ans;
    }
}
