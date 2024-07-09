package vendingmachine;

public class VendingMachine {
    private static VendingMachine instance;
    Inventory inventory;
    private final VendingMachineState idleState;
    private final VendingMachineState readyState;
    private final VendingMachineState dispatchState;
    private final VendingMachineState returnChangeState;
    private VendingMachineState currentState;
    private Product selectedProduct;
    private int totalPayment;

    private VendingMachine(){
        inventory=new Inventory();
        idleState=new IdleState(this);
        readyState=new ReadyState(this);
        dispatchState=new DispatchState(this);
        returnChangeState=new ReturnChangeState(this);
        currentState=idleState;
        selectedProduct=null;
        totalPayment=0;
    }

    //Use Singleton Design Pattern for create single instance
    public static synchronized VendingMachine getInstance(){
        if(instance==null){
            instance=new VendingMachine();
        }
        return instance;
    }

    public void selectProduct(Product product){
        currentState.selectProduct(product);
    }

    public void insertCoin(Coin coin){
        currentState.insertCoin(coin);
    }

    public void insertNote(Note note){
        currentState.insertNote(note);
    }

    public void dispatchProduct(){
        currentState.dispatchProduct();
    }

    public void returnChange(){
        currentState.returnChange();
    }
    public void setSelectedProduct(Product product){
        selectedProduct=product;
    }

    public Product getSelectedProduct(){
        return selectedProduct;
    }

    public void setState(VendingMachineState state){
        currentState=state;
    }

    public VendingMachineState getIdleState(){
        return idleState;
    }

    public VendingMachineState getReadyState(){
        return readyState;
    }
    
    public VendingMachineState getDispatchState(){
        return dispatchState;
    }

    public VendingMachineState getReturnChangeState(){
        return returnChangeState;
    }

    public void addCoin(Coin coin){
        totalPayment+=coin.getValue();
    }

    public void addNote(Note note){
        totalPayment+=note.getValue();
    }

    public int getTotalPayment(){
        return totalPayment;
    }

    public void resetPayment(){
        totalPayment=0;
    }

    public void resetSelectedProduct(){
        selectedProduct=null;
    }
}
