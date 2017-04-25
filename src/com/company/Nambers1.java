package com.company;

/**
 * Created by olikk on 25.04.2017.
 */
public class Nambers1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int sum = a+b;
        System.out.println("a+b=" +sum);
        int sub = a-b;
        System.out.println("a-b=" +sub);
        int mult = a*b;
        System.out.println("a*b=" +mult);
        if (b != 0) {
            int div = a / b;
            System.out.println("a/b=" + div);
            int mod = a % b;
            System.out.println("a%b=" + mod);
        } else {
            System.out.println("b=0, couldn't count / and %");
        }
    }
}
