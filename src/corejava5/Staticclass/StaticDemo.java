package corejava5.Staticclass;

public class StaticDemo {
    static int num1=100;
    static int num2 =200;
    static void displayNum()
    {
        System.out.println("num1 : " +num1);
    }
    static{
        System.out.println("From Static block :");
        System.out.println("Product : " +(num1*num2));
    }
    void sum()
    {
        System.out.println("executing sum function :" +(num1+num2));
    }
}
