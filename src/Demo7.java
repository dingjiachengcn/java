public class demo7 {
    public static void main(String[] args) {
        //学会使用逻辑运算符
        double size = 9.8;
        double storage = 16;
        //需求 尺寸大于6.95
        System.out.println(size >= 6.95 & storage >= 8);//需求尺寸大于6.95， 内存大于等于8

        //需求：要么内存大于8 要么尺寸大于6.95
        System.out.println(size >= 6.95 | storage >= 8);

        System.out.println(!true);
        System.out.println(!false);

        //逻辑异或，必须两个不同结果才是true
        System.out.println(false ^ true);// true
        System.out.println(true ^ false);// true
        System.out.println(true ^ false);// false
        System.out.println(false ^ true);// false

        System.out.println("-------------------------------");
        int a = 10;
        int b = 20;
        System.out.println(a > 100 && ++b > 10);//false
        System.out.println(b);//20

        int i = 10;
        int j = 20;
        System.out.println(i > 100 || ++j > 10);//true
        System.out.println(j);//21
    }
