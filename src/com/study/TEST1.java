package com.study;

public class TEST1 {
    private int length = 0;
    private int[] array;

    public void initList(int max){
        this.array = new int[max];
        this.length =0;
    }

    public void clearList(){
        this.length=0;
    }

    public int insert(int site,int value){
        if(site<1||site>this.array.length){
            //判断插入位置是否合法
            return -1;
        }else if(this.length==this.array.length){
            //判断数组是否已满
            return -2;
        }
        for(int i=this.length-1;i>=site-1;i--){
            this.array[i+1]=this.array[i-1];
        }
        this.array[site-1]=value;
        this.length++;
        return 0;
    }
    public Boolean Delete(int site){
        if(site<1||site>this.length){
            //判断删除位置是否合法
            return false;
        }else if(site == this.length) { //如果要删除的是最后一个元素，直接将顺序表长度减一即可
            this.length--;
            return true;
        }
        for(int i=site-1;i<this.array.length;i++){
            this.array[i]=this.array[i+1];
        }
        this.length--;
        return true;
    }
    public int[] getEllem(int site){
        int[] ret = new int[1];
        if(site<1||site>this.length){
            return null;
        }
        ret[0]=this.array[site-1];
        return ret;
    }
    public int getValue(int site) {
        if(site<1||site>this.length){
            //有问题，暂时这样处理
            return -1;
        }
        return this.array[site-1];
    }

    public int getLength(){
        return this.length;
    }

    public Boolean isEmpty(){
        if(this.length==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
	// write your code here
//        TEST1 test1 = new TEST1();
////        test1.initList(100);
////        test1.insert(1,2);
////        int[] ellem = test1.getEllem(1);
////        System.out.println(ellem[0]);
////        System.out.println(test1.getValue(1));
////        System.out.println(test1.Delete(1));
////        System.out.println(test1.length);
////        System.out.println(test1.isEmpty());
////        System.out.println(test1.getLength());
        String s1="hello";
        String s2="hello";

        System.out.println(s1==s2);
    }
}
