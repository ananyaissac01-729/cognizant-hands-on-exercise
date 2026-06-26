import java.util.HashMap; 

public class Inventory {
    private HashMap<String, Product> products = new HashMap<>();

    public void addProduct(Product product){
        products.put(product.getPId(),product);
        System.out.println("Added : "+ product);
    }

    public void updateProduct(String pId,int newQty, double newPrice){
        Product product = products.get(pId);
        if(product==null){
            System.out.println("Product not found : "+pId);
            return;
        }
        product.setQty(newQty);
        product.setPrice(newPrice);
        System.out.println("Added : "+ product);
    }

    public void deleteProduct(String pId){
        Product removed = products.remove(pId);
        if(removed==null){
            System.out.println("Product not found : "+pId);
        }
        else{
            System.out.println("Deleted : "+removed);
        }
    }
    public void displayAll(){
        System.out.println("\n-----Current Inventory----");
        for(Product p : products.values()){
            System.out.println(p);
        }
        System.out.println("-------------------------");
    }
}
