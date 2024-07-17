import java.util.*;
class NegativeAgeException extends Exception
{
 public String toString()
{
   return "Negative age error.....";
}
}
class AgeDemo
{
 public static void main(String arg[])
{
try
{
  Scanner sc=new Scanner(System.in);
 System.out.println("enter age");
 int age=sc.nextInt();
  if(age<=0)
 throw new NegativeAgeException();

System.out.println("Age="+age);
}catch(Exception e)
{
  System.out.println(e);
}
}
}


 