class myclass
{
int func(int a)
{
System.out.println("base calling");
return 0;
}
}

class myclass1
{
int func(int b)
{
System.out.println("child calling");
return 0;
}
}

class run
{public static void main(String args[])
{
myclass1 obj = new myclass1();
obj.func(10);
}
}
