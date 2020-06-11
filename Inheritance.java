class parent
{
void func()
{
System.out.println("parent");
}
}
class child extends parent
{
void func1()
{
System.out.println("child");
}
}
class example
{
public static void main(String args[])
{
func1 obj = new func1();
obj.func();
}
}
