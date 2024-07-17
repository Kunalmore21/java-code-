import java.util.*;
class College
{
  int cno;
  String cname,cadd;
 Scanner sc=new Scanner(System.in);

 void accepts()
{
 System.out.println("enter college no");
 cno=sc.nextInt();
 System.out.println("enter college name");
 cname=sc.next();
 System.out.println("enter college address");
 cadd=sc.next();
}
}

class Student extends College
{
 int rno;
 String sname;
 float per;
 void acceptc()
{
 System.out.println("enter strudent no");
 rno=sc.nextInt();
 System.out.println("enter student name");
 sname=sc.next();
System.out.println("enter student per");
 per=sc.nextFloat();
}
void disp()
{
  System.out.println("collage no=" +cno);
 System.out.println("collage name=" +cname);
System.out.println("collage address=" +cadd);
System.out.println("student no=" +rno);
System.out.println("student name=" +sname);
System.out.println("student percentage=" +per);

}

public static void main(String arg[])
{
 Student ob=new Student();
 ob.accepts();
 ob.acceptc();
 ob.disp();
}
}
