package com.java;

/**
 * @Author chenlingxiao
 * @Date 2021/8/8 15:08
 */
public class FinalTest {

    public  String name ="clx";
    {
        this.name ="ctx";
    }
    public String getName() {
        return name;
    }

    private void test(){
        System.out.println("调用test");
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        System.out.println(finalTest.getName());
        finalTest.test();
    }
}
