/**
 * ClassName: Num7
 * Package: PACKAGE_NAME
 * Description:
 *给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 *
 * 示例 1：
 *
 * 输入：x = 123
 * 输出：321
 * @Author: Hjr
 * @Create 2023/9/3 16:14
 * @Version 1.0
 */
public class Num7 {
    public static void main(String[] args){
        int a = -21;
        System.out.println(reserve(a));
    }
    public static int reserve(int x){
    //判断是否为负数
        String r = "";
        String xs = x+"";
        String f = "";
        if(xs.substring(0,1).equals("-")){
            f = "-";
            xs = xs.substring(1);
        }
        //反转
        for (int i = xs.length()-1; i >= 0 ; i--) {
            r += xs.charAt(i);
        }
        //返回结果
        try{
            return Integer.parseInt(f+r);
        }catch(Exception e){
            return 0;
        }
    }
}
