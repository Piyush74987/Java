package dataTypes;

public class Character {
    public static void main(String[] args) {

        char ch='A';
        char ch1='Z';
        char ch2='a';
        char ch3='z';
        System.out.println((int)ch);
        System.out.println((int)ch1);
        System.out.println((int)ch2);
        System.out.println((int)ch3);
//        65
//        90
//        97
//        122
          ch=0;// limit
          ch1=65535;// limit
        System.out.println(ch+" ---  "+ch1);
//        ---  ￿
        // some random

        ch=50000;
        ch1=37000;
        ch2= 1555;
        ch3=12345;
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
//        썐
//        邈
//        ؓ
//        〹

        ch='d';//char
        ch1=10084;// number
        ch2='\u27A4';// uncast
        ch3='@';// special char
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
//        d
//        ❤
//        ➤
//        @

    }
}
