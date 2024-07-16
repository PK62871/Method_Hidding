package org.example.hiding;

 class Parent {
    public static void m1(){
        System.out.println("Parent");
    }
}
public class Child extends Parent {
 public static void m1(){
     System.out.println("Child");
 }

    public static void main(String[] args) {

     Parent p = new Parent(); //p
     p.m1();

     Child c = new Child(); //c
     c.m1();

     Parent p1 = new Child(); //p
     p1.m1();
    }
}
