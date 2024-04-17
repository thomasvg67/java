import java.util.Scanner;
interface calc{
    void calculate();
}
class bill implements calc{
    String date,name,p_id;
    int quantity;
    double unit_price,total,namount=0;
    Scanner sc = new Scanner(System.in);
    public void getdata(){
        System.out.println("Enter product id=");
        p_id=sc.nextLine();
        System.out.println("Enter product name=");
        name=sc.nextLine();
        System.out.println("Enter Quantity=");
        quantity=sc.nextInt();
        System.out.println("Enter the unit price=");
        unit_price=sc.nextDouble();
    }
    public void calculate(){
        total= quantity*unit_price;
    }
    public void display(){
        System.out.println(p_id+"\t\t"+name+"\t"+quantity+"\t\t"+unit_price+"\t\t"+total);
    }
}
public class Amount{
    public static void main(String[] args){
        int n,i;
        double namount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order number : ");
        int orderNO = sc.nextInt();
        System.out.println("Enter the date : ");
        String date = sc.next();
        System.out.println("Enter how many products are there : ");
        n = sc.nextInt();
        bill ob[] = new bill[n];
        for(i=0;i<n;i++)
        ob[i]=new bill();
        for(i=0;i<n;i++){
            ob[i].getdata();
            ob[i].calculate();
        }
        System.out.println("Order no. "+orderNO);
        System.out.println("Date : "+date);
        System.out.println("Product id\tName\tQuantity\tUnit price\ttotal");
        System.out.println("_____________________________________________________________");
        for(i=0;i<n;i++){
            ob[i].display();
            namount+=ob[i].total;
        }
        System.out.println("_____________________________________________________________");
        System.out.println("\t\t\t\tNet.amount\t\t"+namount);
    }
}
