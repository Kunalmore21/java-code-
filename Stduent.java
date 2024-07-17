import java.util.*;
class College
{
  int cno;
 String cname;
 Scanner sc=new Scanner(System.in);
void accepts()
{
  System.out.println("Enter college no");
 cno=sc.nextInt();
 System.out.println("Enter collge name");
 cname=sc.next();
}

void disps()
{
  System.out.println("collge no="+cno);
 System.out.println("collge name="+cname);
}
}

class Student extends College
{
  int rno;
 String sname;
 float per;
 
 void accept()
{
  System.out.println("enter roll no");
 rno=sc.nextInt();
 System.out.println("enter name");
 name=sc.next();
 System.out.println("enter per");
 per=sc.nextFloat();
}

class Teacher extends College
{
   int tno;
  String tname;
 float sal;
 
 void accpet()
{
  System.out.println("Enter teacher no");
 tno=sc.nextInt();
 System.out.println("Enter name");
 name=sc.next();
 System.out.println("Enter sal");
 sal=sc.nextFloat();
}

void disp()
{
  System.out.println("Teacher no="+tno);
 System.out.println("Teacher name="+tname);
System.out.println("Teacher salary="+sal);
}
}

class MD
{
  public static void main(String arg[])
{
  Student ob=new Student();
 ob.accepts();
 ob.accept();
 ob.disps();
 ob.disp();

 Teacher ob1=new Teacher();
ob1.accepts();
 ob1.accept();
ob1.disps();
ob1.disp();
}
}

 