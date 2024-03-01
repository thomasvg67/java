import java.util.Objects;
public class Product{
    
    String pcode,pname;
    int price;
    public String getPname(){
      return pname;
    }
    public Product(){
    }
    public Product(String pname,String pcode,int price){
      this.pname=pname;
      this.pcode=pcode;
      this.price=price;
    }
    public void setPname(String pname){
      this.pname=pname;
    }
    public String getPcode(){
      return pcode;
    }
    public void setPcode(String pcode){
      this.pcode=pcode;
    }
    public int getPrice(){
      return price;
    }
    public void setPrice(){
     this.price=price;
    }
    public void display(){
      
      System.out.println("pcode :" + this.pcode);
      System.out.println("pname :" + this.pname);
      System.out.println("price :" + this.price);
    }
    
    public static void main(String[] args) { 
    System.out.println("Name : Thomas V.G\nRollno : 58\nDate : 13/02/2024\nProgram : Symmetric Matrix\n");
    Product p1 =new Product();
    p1.pcode = "Car123"; 
    p1.pname="Benz";
    p1. price=10000;
    System.out.println("******** Displaying.pl*******...");
    p1.display();
    
    Product p2 = new Product("Jaguar", "Car 426", 25000);
    System.out.println("\n******** Displaying-p2**********");
    p2.display();
    
    Product p3 = new Product("Maruti", "Car 800",50000);
    System.out.println("\n******** Displaying.p3**********");
    p3.display();
    
    Product p = p3.getPrice() < (p1.price < p2.price? p1.price:p2.price)? p3: (p1.price < p2.price? p1:p2);
     System.out.println("\n**** Displaying product with lowest price******");
     p.display ();
     }
   }

