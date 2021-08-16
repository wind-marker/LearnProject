package com.study;

/**
 * @Author chenlingxiao
 * @Date 2021/8/3 22:38
 */
public class TEST2 {
    //测试结果:for循环中如果有if语句，会很大的影响效率，如果非必要，尽量把if语句写在外面
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();   //获取开始时间
        int j=0;
        for(int i=1;i<=1000000000;i++){
           if(i==10000){
                System.out.println("bingo");
            }
            /*if(i==20000){
                System.out.println("bingo");
            }*/
            j++;
        }
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

        long start=System.currentTimeMillis();   //获取开始时间
        j=0;
        for(int i=1;i<=1000000000;i++){
            j++;
        }
        long end=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(end-start)+"ms");
    }
}
