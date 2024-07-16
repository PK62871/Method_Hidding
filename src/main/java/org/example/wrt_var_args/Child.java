package org.example.wrt_var_args;

class Parent{
    public static void m1(int... a){
        System.out.println("Parent");
    }
}
public class Child extends Parent{

    public static void m1(int a){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m1(10);

        Child c1 = new Child();
        c1.m1(10);

        Parent p2 = new Child();
       p2.m1(20);
    }
}
