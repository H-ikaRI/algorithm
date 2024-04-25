/**
 * ClassName: Num704
 * Package: PACKAGE_NAME
 * Description:
 * 二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * @Author: Hjr
 * @Create 2023/9/2 14:56
 * @Version 1.0
 */
public class Num704 {
    public static void main(String[] args) {

        int a = s.search(new int[]{-1,0,3,5,9,12},9);
        System.out.println(a);
    }
    class s {
        public static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;

            while(left <= right){

                int middle = (left+right)>>1;//位运算符 等于除2，但是没有溢出的风险
                int num = nums[middle];
                if(num < target){
                    left = middle+1;
                }else if(num > target){
                    right  = middle-1;
                }else{
                    return middle;
                }
            }
        return -1;
        }
    }
}
