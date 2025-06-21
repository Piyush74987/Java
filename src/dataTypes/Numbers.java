package dataTypes;

public class Numbers {
    public static void main(String[] args) {
        // interger number can be stored in
        // int , byte ,short ,long

        byte age=20;
        short ag1=24;
        int age3=30;
        long age4=40;
        // if it exceds int  limit  we need to add l in long
        long num= 2147483649L;

        System.out.println("first is min and then is max ");
        System.out.println("byte limit");
        System.out.println(Byte.MIN_VALUE+" and "+Byte.MAX_VALUE);
        System.out.println("short limit");
        System.out.println(Short.MIN_VALUE+" and "+Short.MAX_VALUE);
        System.out.println("int limit");
        System.out.println(Integer.MIN_VALUE+" and "+Integer.MAX_VALUE);
        System.out.println("long limit");
        System.out.println(Long.MIN_VALUE+" and "+Long.MAX_VALUE);
    }
}
//output
//        first is min and then is max
//        byte limit
//        -128 and 127
//        short limit
//        -32768 and 32767
//        int limit
//        -2147483648 and 2147483647
//        long limit
//        -9223372036854775808 and 9223372036854775807

