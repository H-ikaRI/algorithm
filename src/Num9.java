/**
 * ClassName: Num9
 * Package: PACKAGE_NAME
 * Description:
 *给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 例如，121 是回文，而 123 不是。
 *
 * -231 <= x <= 231 - 1
 *
 * @Author: Hjr
 * @Create 2023/9/4 20:17
 * @Version 1.0
 */
public class Num9 {
    public static void main(String[] args) {
        int a = -126721;
        System.out.println(isPalindrome(a));
    }
        public static boolean isPalindrome(int x) {
        int c = 0;
            if(x < 0 || (x%10 == 0 && x!=0) ){
                return false;
            }else{
                while(x > c){
                        c = c * 10 + x % 10;
                        x /= 10;
                }
            }
            return c == x || x == c / 10;
    }
}
