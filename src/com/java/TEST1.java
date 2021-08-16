package com.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author chenlingxiao
 * @Date 2021/8/7 16:06
 */
public class TEST1 {
    public static void main(String[] args) {
        String sentence ="abcde";
//        int a = sentence.codePointAt(3);
//        System.out.println(sentence.codePointCount(0,sentence.length()));
        int[] a={1,2,3,4,5,};
        System.out.println((int)(Math.random()*3));
        System.out.printf("%4d", 3);
        System.out.println();
        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        System.out.println(today);
        System.out.println(date.minusDays(today-1));
        System.out.println(Arrays.toString(a));



//        if(Character.isSurrogate())
    }
}
