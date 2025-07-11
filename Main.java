

public class Main {
     public static void main(String[] args) {
          Monitor godwinMonitor = new Monitor(2000,25,"1980x1080");
          Processor godwinProcessor = new Processor(16,3600,16);
          ComputerCase godwinComputerCase = new ComputerCase("Black",true);

          Computer comp = new Computer(godwinComputerCase, godwinMonitor, godwinProcessor);

          comp.turnOn();
          comp.turnOff();
//          Processor.add();
          System.out.println(godwinMonitor.getBrightness());
          comp.setManufactureName("Asus");
          System.out.println(comp.getManufactureName());

          }

}

