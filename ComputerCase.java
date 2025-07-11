public class ComputerCase extends Product{
    private String color;
    private boolean isRGB;

    public ComputerCase(String color, boolean isRGB,String manufactureName,
                        String productName, int price){
        super(manufactureName, productName, price);
        this.color = color;
        this.isRGB = isRGB;
    }

    public ComputerCase(String color,boolean isRGB){
        this(color,isRGB,null,null,0);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isRGB(){
        return isRGB;
    }

    public void setRGB(boolean isRGB){
        this.isRGB = isRGB;
    }

    public void dismantleCase(){
        System.out.println("Dismantling Case......");
    }
}
