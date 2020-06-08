import java.io.*;
class A
{
    int func(int a)
    {
        System.out.println("Method 1 is calling");
        return 0;
    }
    int func(int a, int b)
    {
        System.out.println("Method 2 is calling");
        return 0;
    }
}

class main
{
public static void main(String args[])
    {
        A obj = new A();
        obj.func(6);
        obj.func(6,7);
    }
}
