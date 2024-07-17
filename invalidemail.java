import java.util.*;
class InvalidEmailException extends Exception
{
 public String toString()
{

   return "Invalid Email ID....";
}
}

class Demo
{
  public static void main(String arg[])
{
  try
{
  Scanner sc=new Scanner(System.in);
 System.out.println("enter email id...");
 String s=sc.next();
int f=0;
for(int i=0;i<s.length();i++)
{
 char ch=s.charAt(i);
 if(ch=='@')
 f=1;
}
if(f==0)
throw new InvalidEmailException();

System.out.println("Email id="+s);
}
catch(Exception e)
{
  System.out.println("error="+e);
}
}
}
