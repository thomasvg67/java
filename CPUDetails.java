class CPU{
  double price;
  class Processor{
    double cores;
    String manufacturer;
    double getCache(){
      return 4.3;
    }
  }
  protected class RAM{
  double memory;
  String manufacturer;
  double getClockSpeed(){
    return 5.5;
  }
  }
}
public class CPUDetails{
    public static void main(String[] args){
      System.out.print("Name : Thomas V.G\nRollno : 58\nDate : 13/02/2024\nProgram : CPU Details\n");
      CPU cpu = new CPU();
      CPU.Processor processor = cpu.new Processor();
      CPU.RAM ram = cpu.new RAM();
      System.out.println("Processor cache = " + processor.getCache());
      System.out.println("Ram Clock Speed = "+ ram.getClockSpeed());
    }
  }

