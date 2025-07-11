
public class Monitor extends Product {
    private int brightness;
    private int screenSize;
    private String resolution;

    public Monitor(int brightness, int screenSize, String resolution,
                   String manufactureName,String productName, int price){
        super(manufactureName,productName,price);
        this.brightness = brightness;
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public Monitor(int brightness, int screenSize, String resolution){
        this(brightness,screenSize,resolution,null,null,0);
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    public int getBrightness(){
        return brightness;
    }

    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }

    public int getScreenSize(){
        return screenSize;
    }

    public void setResolution(String resolution){
        this.resolution = resolution;
    }

    public String getResolution(){
        return resolution;
    }

    public void message(String str){
        System.out.println("The following message is being printed......" + str);
    }
}
