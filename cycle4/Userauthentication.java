import java.util.Scanner;
class authException extends Exception
{
public authException(String s)
{
super(s);
}
}
public class Userauthentication
{
public static void main(String[] args)
{
String username = "SJCET";
String passcode = "SJCET2024";
String user_name,password;
Scanner sc = new Scanner(System.in);
try
{
System.out.println("Name: Thomas V.G \nReg no : 23MCA058 \nDate : 15/04/2024 ");
System.out.println("Program 19 : Write a user defined exception class to authenticate the user name and password.");
System.out.println("Enter the username:");
user_name = sc.nextLine();
System.out.println("Enter the password:");
password = sc.nextLine();
if(username.equals(user_name) && passcode.equals(password))
{
System.out.println("Authentication successful...");
}
else
throw new authException("Invalid user credentials");
}
catch(authException e)
{
System.out.println("Exception caught "+e);
}
}
}
