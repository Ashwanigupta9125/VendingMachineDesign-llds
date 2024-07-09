package vendingmachine;

public class DispatchState implements VendingMachineState{
    private final VendingMachine vendingMachine;

    public DispatchState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }
    
    @Override
    public void selectProduct(Product product){
        System.out.println("Product already selected. Please collect the dispensed product.");
    }

    @Override
    public void insertCoin(Coin coin){
        System.out.println("Product already selected. Please collect the dispensed product.");
    }

    @Override
    public void insertNote(Note note){
        System.out.println("Product already selected. Please collect the dispensed product.");
    }

    @Override 
    public void dispatchProduct(){
        Product product=vendingMachine.getSelectedProduct();
        vendingMachine.inventory.updateQuantity(product, vendingMachine.inventory.getQuantity(product)-1);
        System.out.println("Product dispatched: " + product.getName());
        vendingMachine.setState(vendingMachine.getReturnChangeState());
    }

    @Override
    public void returnChange(){
        System.out.println("Please collect the dispensed product first.");
    }
}
