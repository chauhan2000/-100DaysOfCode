import java.util.*;
import java.util.Scanner;
class ifelse
{
void func(int age)
{

if (age >= 18)
{
System.out.println("You are welcome");
}
else if(age<18)
{
System.out.println("Please verify your aadhar");
}
}

public static void main(String args[])

{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age");
ifelse obj = new ifelse();
obj.func(sc.nextInt());
}

}
