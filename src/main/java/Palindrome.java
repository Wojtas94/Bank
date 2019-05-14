public class Palindrome {
    public static boolean isPalindrome(String word) {
        int a = word.length();
        String reverse = "";
        String str1= "";
        String str2= "";

        if(a%2==0){
             str1 = word.substring(0, a/2);
             str2 = word.substring((a/2));
        }
        else{
             str1 = word.substring(0, a/2);
             str2 = word.substring((a/2)+1);
        }
        for(int i = str2.length() - 1; i >= 0; i--) {
            reverse = reverse + str2.charAt(i); }

        if(!reverse.equalsIgnoreCase(str1)){
            return false;
        }
        return true;


    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleeled"));
    }
}