public class Computer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Processor processor;

    public Computer(ComputerCase computerCase,Monitor monitor, Processor processor,
                    String manufactureName, String productName, int price){
        super(manufactureName,productName,price);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.processor = processor;
    }

    public Computer(ComputerCase computerCase,Monitor monitor, Processor processor){
        this(computerCase,monitor,processor,null,null,0);
    }



    public void setComputerCase(ComputerCase computerCase){
        this.computerCase = computerCase;
    }

    public ComputerCase getComputerCase(){
        return computerCase;
    }

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    public Monitor getMonitor(){
        return monitor;
    }

    public void setProcessor(Processor processor){
        this.processor = processor;
    }

    public Processor getProcessor(){
        return processor;
    }

    public void turnOn(){
        System.out.println("Turning On....");
    }

    public void turnOff(){
        System.out.println("Turning Off....");
    }


}
