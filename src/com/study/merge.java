package com.study;


/**
 * @Author chenlingxiao
 * @Date 2021/8/4 22:05
 */
public class merge {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7,8,9};
        int b[]=new int[]{9};
        int c[] = mergeList(a,b);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
    public static int[] mergeList(int a[],int[] b){
        int c[] = new int[a.length+b.length];
        int ia=0,ib=0,ic=0;
        while(ia<a.length&&ib<b.length){
            if(a[ia]<=b[ib]){
                c[ic]=a[ia];
                ia++;
            }else if(a[ia]>b[ib]){
                c[ic]=b[ib];
                ib++;
            }
            ic++;
        }
        while(ib<b.length&&ic!=c.length) {
            //将b追加
            c[ic]=b[ib];
            ic++;
        }
        while(ia<a.length&&ic<=c.length) {
            //将a追加
            c[ic]=a[ia];
            ic++;
        }
        return c;
    }

}
