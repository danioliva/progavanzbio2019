package org.uma.pab19.store;

public interface Store {
        boolean areThereEnoughProducts(String productName, int amount);
        void removeProducts(String productName, int amount);
}
