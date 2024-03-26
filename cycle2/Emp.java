import java.util.Scanner;
public class Emp
{
int eno;
String ename;
double esalary ;
public void Emp(int no,String s ,double sal)
{
eno = no;
ename = s;
esalary = sal;
}
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter employee id :");
eno =sc.nextInt();
System.out.println("enter employee name : ");
ename = sc.next();
System.out.println("enter employee salary:");
esalary = sc.nextDouble();
}
void display()
{
System.out.println("employee id is : "+eno);
System.out.println("employee name is : "+ename);
System.out.println("employee salary is : "+esalary);
}
public static void main(String[] args)
{
int a,i,fl;
System.out.print("Name : Thomas V.G\nRollno : 58\nDate : 26/03/2024\nProgram : Employee Details\n");
System.out.println("enter the number of employees:");
Scanner sc1=new Scanner(System.in);
int n=sc1.nextInt();
Emp e1[]=new Emp[n];
for(i=0;i<n;i++)
{
System.out.println("Enter details of employee "+(i+1));
e1[i]=new Emp();
e1[i].getdata();
}
System.out.println("Employee details are:");
for ( i = 0; i <n; i++)
{
System.out.println("details of employee "+i+ "are:");
e1[i].display();
}
System.out.println("Enter employe id to be searched for:");
a=sc1.nextInt();
for(i=0;i<n;i++)
{
if(a==e1[i].eno)
{
fl=1;
break;
}
}
System.out.println("details of corresponding employee are:");
e1[i].display();
}
}
