package edu.ledo.Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InventoryManager {

    private List<Product> products= new ArrayList<Product>();



    public void addProduct(Product product) {
        products.add(product);
    }

    public void showInventory(){
        products.sort((Product p1, Product p2)->Integer.compare(p1.getId(),p2.getId()));
        for (Product product : products) {
            System.out.print(product);
        }


    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> findAnyBrand(String brandName){
        List<Product> productsFind=new ArrayList<Product>();
        for (Product product : products) {
            if (product.getBrand().equals(brandName)) {
                productsFind.add(product);
            }
        }
        return productsFind;
    }

   public List<Product> findAnyBrand2(String brandName){
        return products.stream().filter(p -> {
            return p.getBrand().getName().equals(brandName);

        }).toList();
    }

}
