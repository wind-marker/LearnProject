package com.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chenlingxiao
 * @Date 2021/8/15 20:33
 */
public class TestMethods {
    public static void main(String[] args) {
        StudentBean student1 = new StudentBean("1","clx","24");
        StudentBean student2 = new StudentBean("1","clx","24");

        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(student1);
        arrayList2.add(student1);
        System.out.println(arrayList.contains(student2));
        System.out.println(arrayList.containsAll(arrayList2));
    }
}
