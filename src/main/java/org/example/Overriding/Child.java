package org.example.Overriding;

class Parent{
    public void test(){
        System.out.println("Parent");
    }
}
public class Child  extends Parent{

    public void test(){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.test();

        Child c = new Child();
        c.test();

        Parent p1 =new Child();
        p1.test();


    }
}
