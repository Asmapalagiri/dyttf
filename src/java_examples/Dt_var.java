package java_examples;

public class Dt_var {
    int b = 40; //instance
static int empid = 101; //static
public void m1() {
//  DT  Var  VV
    int  a = 10; //loc var
    System.out.println("M1 Executed");
    //              int       string
    System.out.println(a + "is local var");  //10
    System.out.println(empid + " is static var");
}
public void m2() {
    System.out.println("M2 Executed");
    System.out.println(b + "is instance var");
    System.out.println(empid + " static var");
}
public void m3() {
    System.out.println("M3 Executed");
    System.out.println(b + " is instance var");
}
public static void main(String args[]) {
    System.out.println("===main method executed");
//classname objectname = new classname();
    Dt_var   m  = new Dt_var();
    m.m1();
    m.m2();
    m.m3();
}
}