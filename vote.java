import java.util.*;
class VotingException extends Exception
{
  public String toString()
{
  return "Candidate is not eligible for voting";
}
}

class votedemo
{
 public static void main(String arg[])
{
 try
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter age");
 int age=sc.nextInt();
 if(age<18)
 throw new VotingException();

System.out.println("you are eligible for voting="+age);
 }catch(VotingException e)
{
  System.out.println("use error="+e);
 }catch(Exception e1)
{
  System.out.println("system error="+e1);
}
}
}