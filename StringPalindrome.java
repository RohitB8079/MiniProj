import java.util.Scanner;
public class StringPalindrome {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str =sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev +" "+ (str.equals(rev) ? "String is palindrome" : "String is not palindrome"));
    }

    
}
