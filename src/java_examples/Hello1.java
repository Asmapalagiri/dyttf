package java_examples;

public class Hello1 {
public void m1() {
    System.out.println("M1 executed");
}
public void m2() {
    System.out.println("M2 executed");
}
public void m3() {
    System.out.println("M3 executed");
}
public static void main(String args[]) {
    System.out.println("main method executed");
    Hello1  m = new Hello1();
    m.m1();
    m.m3();
    m.m2();
}
}