package com.java;

/**
 * @Author chenlingxiao
 * @Date 2021/8/8 14:21
 */
public class ObjectTest {
    private String name;
    private String city;
    private int age;

    public ObjectTest(String name, String city, int age) {
       this.name = name;
       this.city = city;
       this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void nameToCity(ObjectTest test){
        test.city =test.name;
    }

    public static void main(String[] args) {
        ObjectTest test1 = new ObjectTest("clx","WuHan",4);
        System.out.println(test1.getAge());
        test1.nameToCity(test1);
        System.out.println(test1.getCity());
    }
}
