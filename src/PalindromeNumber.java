import java.util.Scanner;
/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * < số nguyên tố Palindrome hay số xuôi ngược nguyên tố là số nguyên tố viết xuôi hay viết ngược vẫn chỉ cho ra một số >
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * */
public class PalindromeNumber {

    // chia so lam 2 chuoi ngang nhau va so sanh
    public boolean isPalindrome(int x) {
        if(x< 0 || (x % 10 ==0 && x!=0)) return false;
        else{
            int  reversedHalf = 0;
            while (x > reversedHalf){
                reversedHalf = (reversedHalf * 10) + (x % 10);
                x = x/10;
            }
            return  x==reversedHalf ||x == reversedHalf/10;
        }
    }
    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(new Scanner(System.in).nextInt()));
    }
}