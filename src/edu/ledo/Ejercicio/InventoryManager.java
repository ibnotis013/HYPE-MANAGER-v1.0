package edu.ledo.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    private List<Product> products;



    public void addProduct(Product product) {
        products.add(product);
    }

    public void showInventory(){
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void findAnyBrand(String brandName){
        List<Product> productsFind=new ArrayList<Product>();
        for (Product product : products) {
            if (product.getBrand().equals(brandName)) {
                productsFind.add(product);
            }
        }
        products.addAll(productsFind);
    }

}
