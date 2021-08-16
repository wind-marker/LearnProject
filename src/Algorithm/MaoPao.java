package Algorithm;

import java.util.Arrays;

/**
 * @Author chenlingxiao
 * @Date 2021/8/12 23:44
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] a= new int[]{8,9,10,5,4,6,9,8,7,1,2,3,5,4,5,8};
        int[] b = MaoPao2(a);
        System.out.println(Arrays.toString(b));
    }

    private static int[] MaoPao(int[] a) {
        //相当于将最小值赋给a[i]
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>=a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        return a;
    }

    private static int[] MaoPao2(int[] a) {
        //第一轮会找到一个最小值放在最前面，i=1后会将最小值赋予a[i],可能不算冒泡排序,是选择排序？
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]>=a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        return a;
    }
}
