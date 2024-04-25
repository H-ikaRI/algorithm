/**
 * ClassName: Num14
 * Package: PACKAGE_NAME
 * Description:
 *编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 *
 * 提示：
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 * @Author: Hjr
 * @Create 2023/9/6 17:03
 * @Version 1.0
 */
public class Num14 {
    public static void main(String[] args) {
        String[] a = {"flower","flo","floo"};
        System.out.println(longestCommonPrefix(a));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String w = strs[0];

        for (int i = 1;i < strs.length;i++){
            int j = 0;
        for (;j < w.length() && j < strs[i].length();j++){
            if(w.charAt(j) != strs[i].charAt(j)){
                break;
                }
            }
        w = w.substring(0,j);
//        if(w.equals("")){
//            return w;
//            }
            //我觉得这段不是很有用，但是它好像可以避免str[0]为空的多余运算，但是好像是在for循环之后才判断，还是没用
        }
        return w;
    }
}
