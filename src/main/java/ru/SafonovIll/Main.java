package ru.SafonovIll;

public class Main {

    public static void main(String[] args) {


        int a = 25;
        int b = 10;
        int c = 33;
        double d = 22.5;
        boolean e = true;
        boolean f = false;
        int g = Integer.MAX_VALUE;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a : b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("c ++ = " + (c ++ ));
        System.out.println("c -- = " + (c -- ));
        System.out.println("-- c  = " + (-- c ));
        System.out.println("++ c = " + (++ c ));


        System.out.println("a == b " + (a == b) );
        System.out.println("a != b " + (a != b) );
        System.out.println("a > b " + (a > b) );
        System.out.println("a < b " + (a < b) );


        System.out.println("e && f = " + (e && f) );
        System.out.println("e || f = " + (e || f) );
        System.out.println("!(e && f) = " + !(e && f) );

        System.out.println("int + double = c + d = " + (c + d));
        System.out.println("int * double = c + d = " + (c * d));
        System.out.println("Переполнение: " + (g + a ));


    }
}
