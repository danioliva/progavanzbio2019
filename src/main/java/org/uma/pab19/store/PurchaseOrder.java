package org.uma.pab19.store;

public class PurchaseOrder {
    private String productName;
    private int amount;

    /**
     * Constructor
     * @param productName
     * @param amount
     */
    public PurchaseOrder(String productName, int amount){
        this.productName=productName;
        this.amount=amount;
    }

    /**
     * Method to buy a product from a {@link Store}
     * @param store
     */

    public void buy(Store store){
        if(store.areThereEnoughProducts(productName,amount)){
            store.removeProducts(productName,amount);
        }
    }
}
