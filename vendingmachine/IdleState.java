package vendingmachine;

public class IdleState implements VendingMachineState{
    private final VendingMachine vendingMachine;
    
    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }
    
    @Override
    public void selectProduct(Product product){
        if(vendingMachine.inventory.isAvailable(product)){
            vendingMachine.setSelectedProduct(product);
            vendingMachine.setState(vendingMachine.getReadyState());
            System.out.println("Product Selected : " + product.getName());
        }else{
            System.out.println("Product Not Available: " + product.getName());
        }
    }

    @Override
    public void insertCoin(Coin coin){
        System.out.println("Please select a product first...");
    }

    @Override
    public void insertNote(Note note){
        System.out.println("Please select a product first...");
    }

    @Override 
    public void dispatchProduct(){
        System.out.println("Please select a product and make payment...");
    }

    @Override
    public void returnChange(){
        System.out.println("Please select a product and make payment...");
    }
}
