import java.util.*;
class NumberIsZeroException extends Exception
{
 public String toString()
{
  return "number is zero error";
}
}
class palDemo
{

 public static void main(String arg[])
{
  try
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter number");
 int n=sc.nextInt();
if(n==0)
throw new NumberIsZeroException();
int n1=n;
 int r=0;
  while(n>0)
{
  int d=n%10;
 r=(r*10)+d;
 n/=10;
}
if(r==n1)
 System.out.println("number is palindrome");
 else
System.out.println("number is not palindrome");
}catch(NumberIsZeroException e)
{
  System.out.println(e);
 }catch(Exception e1)
{
  System.out.println("number is valid");
}
}
}
