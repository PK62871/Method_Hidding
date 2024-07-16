package org.example.wrt_variable;

class Parent{
   // String s = "Parent";
    static  int s = 80;
}
public class Child extends Parent{

   static int s = 10;

    public static void main(String[] args) {

        Parent p = new Parent();
        System.out.println(p.s);

        Child c = new Child();
        System.out.println(c.s);

        Parent p2 = new Child();
        System.out.println(p2.s);

    }
}
