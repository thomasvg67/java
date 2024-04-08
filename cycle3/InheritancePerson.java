import java.util.*;
class Person{
String Name;
String Gender;
String Address;
String Age;
public Person(String Name,String Gender,String Address,String Age){
this.Name=Name;
this.Gender=Gender;
this.Address=Address;
this.Age=Age;
}
}
class Employee extends Person {
String Empid;
String Company_Name;
String Qualification;
String Salary;
public Employee(String Name,String Gender,String Address,String Age ,String
Empid,String Company_Name, String Qualification,String Salary){
super(Name,Gender,Address,Age);
this.Empid= Empid;
this.Company_Name=Company_Name;
this.Qualification=Qualification;
this.Salary=Salary;
}
}
class Teacher extends Employee{
String Teacherid;
String Department;
String Subject;
public Teacher(String Name,String Gender,String Address,String Age,String
Empid,String Company_Name,String Qualification,String Salary,String Teacherid,String
Department,String Subject){
super(Name,Gender,Address,Age,Empid,Name,Qualification, Salary);
this.Teacherid=Teacherid;
this.Department=Department;
this.Subject=Subject;
}
public void read(){
Scanner s =new Scanner(System.in);
System.out.println("enter the Name:");
Name=s.nextLine();
System.out.println("enter the Gender:");
Gender=s.nextLine();
System.out.println("enter the Address:");
Address=s.nextLine();
System.out.println("enter the Age:");
Age=s.nextLine();
System.out.println("enter the Employ id:");
Empid=s.nextLine();
System.out.println("enter the Company Name:");
Company_Name=s.nextLine();
System.out.println("enter the Qualification:");
Qualification=s.nextLine();
System.out.println("enter the Salary:");
Salary=s.nextLine();
System.out.println("enter the Teacher id:");
Teacherid=s.nextLine();
System.out.println("enter the Department:");
Department=s.nextLine();
System.out.println("Enter the Subject:");
Subject=s.nextLine();
}
public void display(){
System.out.println("\nEmployee Details");
System.out.println("Name: "+ Name);
System.out.println("Gender: " + Gender);
System.out.println("Address: " + Address);
System.out.println("Age: " + Age);
System.out.println("Empid: " + Empid);
System.out.println("Company Name: " + Company_Name);
System.out.println("Qualification: " + Qualification);
System.out.println("Salary:" + Salary);
System.out.println("\nTeachers Details");
System.out.println("Teacher id: " + Teacherid);
System.out.println("Department: " + Department);
System.out.println("Subject: " + Subject);
}
}
class InheritancePerson{
public static void main(String Args[]){
System.out.println("Name : TOBIN K TOMY\nRoll No : 23MCA059\nDate : 06/04/2024");
System.out.println("Program 12: ");
int i,n;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the Number of employee's");
n=sc.nextInt();
Teacher T[ ] = new Teacher[n];
for(i=0;i<n;i++){
T[i]=new
Teacher("Name","Gender","Address","Age","Empid","Name","Qualification","Salary","Teacherid","Department","Subject");
T[i].read();
}
for(i=0;i<n;i++){
T[i].display();
}
}
}
