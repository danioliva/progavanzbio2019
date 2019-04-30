package org.uma.pab19.store;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PurchaseOrderTest {

    @Test
    public void shouldBuyRemoveProductsIfThereAreEnoughItems(){
        Store store=mock(Store.class);

        when(store.areThereEnoughProducts("Bread", 15)).thenReturn(true);

        PurchaseOrder purchaseOrder=new PurchaseOrder("Bread",15);
        purchaseOrder.buy(store);

        verify(store).removeProducts("Bread",15);
    }

    @Test
    public void shouldBuyDoNotRemoveProductsIfThereAreNotEnoughItems(){
        Store store=mock(Store.class);

        when(store.areThereEnoughProducts("Beer", 6)).thenReturn(false);

        PurchaseOrder purchaseOrder=new PurchaseOrder("Beer", 6);
        purchaseOrder.buy(store);

        verify(store,never()).removeProducts("Beer",6);
    }
}