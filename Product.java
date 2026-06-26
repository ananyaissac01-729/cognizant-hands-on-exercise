public class Product {
    private String pId;
    private String pName;
    private int qty;
    private double price;

    public Product(String pId, String pName, int qty, double price){
        this.pId = pId;
        this.pName = pName;
        this.qty = qty;
        this.price = price;
    }

    public String getPId(){ return pId; }
    public String getPName(){ return pName; }
    public int getQty(){ return qty; }
    public double getPrice(){ return price; }

    public void setQty(int qty){
        this.qty = qty;
    }
    public void setPrice(double price){
        this.price = price;
    }
 
    @Override
    public String toString(){
        return ("Product \n id =" + pId + " \n name =" + pName + " \n qty = " + qty + " \n price = Rs." + price + "\n");
    }
}
