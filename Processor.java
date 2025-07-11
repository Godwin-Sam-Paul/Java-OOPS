public class Processor extends Product{
    private int RAM;
    private int frequency;
    private int core;

    public Processor(int RAM, int frequency,int core, String manufactureName, String productName, int price){
        super(manufactureName,productName,price);
        this.RAM = RAM;
        this.frequency = frequency;
        this.core = core;
    }

    public Processor(int RAM, int frequency,int core){
        this(RAM,frequency,core,null,null,0);
    }

    public void setRAM(int RAM){
        this.RAM = RAM;
    }

    public int getRAM(){
        return RAM;
    }

    public void setFrequency(int frequency){
        this.frequency = frequency;
    }

    public int getFrequency(){
        return frequency;
    }

    public void setCore(int core){
        this.core = core;
    }

    public int getCore(){
        return core;
    }

    public void processingSomething(){
        System.out.println("Processing Something......");
    }


}
