public class InventoryTest {
    public static void main(String [] args){
        Inventory i = new Inventory();

        i.addProduct(new Product("P01","Phone",10,10000.0));
        i.addProduct(new Product("P02","PC",5,20000.0));

        i.displayAll();
        i.updateProduct("P01",2,15000.0);
        i.deleteProduct("P02");
        i.displayAll();
    }
}
