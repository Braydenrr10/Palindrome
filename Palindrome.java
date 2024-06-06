public class Palindrome {
    /**
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        Stringbuilder cleanStr = new StringBuilder();
           for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanedStr.append(Charcter.toLowerCase(ch));
            
            }           
        }
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (ledt < right){
            if ((cleanedStr.charAt(left)) != (cleanedStr.charAt(right))) {
                return false;
            }
        left++;
        right++;
        }
        return true;
}


public static void main(String [] args) {
    String[] testCases = {
        "A man, a plan, a canal, Panama!",
            "racecar",
            "hello",
            "Was it a car or a cat I saw?",
            "No 'x' in Nixon",
            "12321"
        };
        for ( String testCase : testCases) {
            System.out.println(testCase + ":" + isPalindrome(testCase));
        }
    }
}
