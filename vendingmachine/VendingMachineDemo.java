package vendingmachine;

public class VendingMachineDemo {
    public static void main(String[] args) {
        //Create Single Instance for VendingMachine Class
        VendingMachine vendingMachine=VendingMachine.getInstance();

        //Add Products
        Product coke=new Product("Coke",20);
        Product chocolate=new Product("chocolate", 5);
        Product biscuit=new Product("biscuit",10);
        Product cake=new Product("cake", 60);

        //Add Products to Inventory
        vendingMachine.inventory.addProduct(coke,10);
        vendingMachine.inventory.addProduct(biscuit, 6);
        vendingMachine.inventory.addProduct(chocolate, 5);
        vendingMachine.inventory.addProduct(cake, 1);

        //Select Buying Product 
        vendingMachine.selectProduct(biscuit);

        // Insert Coins
        vendingMachine.insertCoin(Coin.FIVE);
        vendingMachine.insertCoin(Coin.TWO);

        //Insert Note
        vendingMachine.insertNote(Note.TWENTY);

        // //Dispatch Product
        vendingMachine.dispatchProduct();

        // //Get Change
        vendingMachine.returnChange();
        
        //Select Buying Product
        vendingMachine.selectProduct(coke);

        //Insert Coins
        vendingMachine.insertCoin(Coin.ONE);

        //Insert Note
        vendingMachine.insertNote(Note.FIFTY);

        //Dispatch Product
        vendingMachine.dispatchProduct();

        //Get Change
        vendingMachine.returnChange();

        //Select Buying Product
        vendingMachine.selectProduct(chocolate);

        //Insert Coins
        vendingMachine.insertCoin(Coin.TEN);

        //Dispatch Product
        vendingMachine.dispatchProduct();

        //Get Change
        vendingMachine.returnChange();

        //Select Buying Product
        vendingMachine.selectProduct(cake);

        //Insert Note
        vendingMachine.insertNote(Note.HUNDRED);

        //Dispatch Product
        vendingMachine.dispatchProduct();

        //Get Change
        vendingMachine.returnChange();

    }
}
