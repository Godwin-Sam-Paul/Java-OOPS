import java.util.PrimitiveIterator;

public class Product {
    private int length;
    private int width;
    private String manufactureName;
    private String productName;
    private int price;

    public Product(int length,int width,String manufactureName,String productName, int price){
        this.length = length;
        this.width = width;
        this.manufactureName = manufactureName;
        this.productName = productName;
        this.price = price;

    }

    public Product(String manufactureName, String productName, int price){
        this(0,0,manufactureName,productName,price);
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public void setManufactureName(String manufactureName){
        this.manufactureName = manufactureName;
    }

    public String getManufactureName(){
        return manufactureName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
