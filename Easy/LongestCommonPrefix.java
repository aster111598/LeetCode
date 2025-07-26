package Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" };
        Arrays.sort(str);
        String pre = str[0];

        for (int i = 1; i < str.length; i++) {
            for (int j = 0; j < pre.length(); j++) {
                if (pre.charAt(j) != str[i].charAt(j)) {
                    pre = pre.substring(0, j);
                }
            }
        }

        System.out.println(pre);

    }

}