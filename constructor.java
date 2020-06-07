import java.io.*;
public class constructor
{
    String name;
    public constructor()
    {
        name = "Rachit";
    }
    
    public static void main(String args[])
    {
        constructor obj = new constructor();
        System.out.println(obj.name);
        
    }
}

