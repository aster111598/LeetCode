package Easy;

public class RomantoInterger {
    public static void main(String[] args) {
        /* I=1, V=5, X=10, L=50, C=100, D=500, M=1000 */
        /* IV=4, IX=9, XL=40, XC=90, CD=400, CM=900 */
        /* V=5, L=50, D=500, M=1000 */
        String s = "III";
        int ans = 0;
        for (int i = 0; i < s.length();) {
            String tempString = "";
            tempString = tempString + s.charAt(i);
            if (i == s.length() - 1) {
                switch (tempString) {
                    case "I":
                        ans = ans + 1;
                        break;
                    case "V":
                        ans = ans + 5;
                        break;
                    case "X":
                        ans = ans + 10;
                        break;
                    case "L":
                        ans = ans + 50;
                        break;
                    case "C":
                        ans = ans + 100;
                        break;
                    case "D":
                        ans = ans + 500;
                        break;
                    case "M":
                        ans = ans + 1000;
                        break;
                }
                break;
            }
            switch (tempString) {
                case "M":
                    ans = ans + 1000;
                    i++;
                    break;
                case "D":
                    ans = ans + 500;
                    i++;
                    break;
                case "C":
                    tempString = tempString + s.charAt(i + 1);
                    switch (tempString) {
                        case "CM":
                            ans = ans + 900;
                            i = i + 2;
                            break;
                        case "CD":
                            ans = ans + 400;
                            i = i + 2;
                            break;
                        default:
                            ans = ans + 100;
                            i++;
                            break;
                    }
                    break;
                case "L":
                    ans = ans + 50;
                    i++;
                    break;
                case "X":
                    tempString = tempString + s.charAt(i + 1);
                    switch (tempString) {
                        case "XC":
                            ans = ans + 90;
                            i = i + 2;
                            break;
                        case "XL":
                            ans = ans + 40;
                            i = i + 2;
                            break;
                        default:
                            ans = ans + 10;
                            i++;
                            break;
                    }
                    break;
                case "V":
                    ans = ans + 5;
                    i++;
                    break;
                case "I":
                    tempString = tempString + s.charAt(i + 1);
                    switch (tempString) {
                        case "IX":
                            ans = ans + 9;
                            i = i + 2;
                            break;
                        case "IV":
                            ans = ans + 4;
                            i = i + 2;
                            break;
                        default:
                            ans = ans + 1;
                            i++;
                            break;
                    }
                    break;
            }

        }
        System.out.println(ans);
    }
}
