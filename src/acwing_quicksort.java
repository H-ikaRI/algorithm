import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * ClassName: acwing_sort
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: Hjr
 * @Create 2024/4/25 8:25
 * @Version 1.0
 */
public class acwing_quicksort {

    private static int[] sort(int[] arr,int left,int right){

        //判断是不是最后一个元素，如果是直接返回数组,判断边界
        if (left>=right){
            return arr;
        }

        //取数组两边为参照值，取分界点
        int p = arr[(left+right)>>1];
        //将左右边界各挪一下
        int i = left-1;
        int j = right+1;

        while (i<j){
            //如果arri没有找到比p大的值则一直循环，j同理，找到以后执行if判断，若i<j则交换两个值
            while(arr[++i]<p);
            while(arr[--j]>p);

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //开始递归
        sort(arr,left,j);
        sort(arr,j+1,right);
        return arr;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = IntStream.range(0,n).map(i->scanner.nextInt()).toArray();
        int []sortarr = sort(arr,0,n-1);
        IntStream.range(0,n).mapToObj(i->sortarr[i]+" ").forEach(System.out::print);

    }
}
