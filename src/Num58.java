/**
 * ClassName: Num58
 * Package: PACKAGE_NAME
 * Description:
 *给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 解释：最后一个单词是“World”，长度为5。
 * @Author: Hjr
 * @Create 2023/9/8 16:45
 * @Version 1.0
 */
public class Num58 {
    public static void main(String[] args) {
        String b = "ca ss qo   ";
        System.out.println(lengthOfLastWord(b));
    }
    public static int lengthOfLastWord(String s) {
        int end = s.length()-1;
        int start = 0;
       while(end>=0&&s.charAt(end)==' '){
           end--;
       }
       if(end<0){return 0;}
       start = end;
       while(start>=0&&s.charAt(start)!=' '){
             start--;
       }
        return end - start;

    }
}
