package edu.ledo.Ejercicio;

import java.util.Map;

public class Main {
    static void main() {
        InventoryManager inventoryManager=new InventoryManager();

        Brand marca1=new Brand("Nike","Spain",10);
        Brand marca2=new Brand("Adidas","Moroco",9);


        Sneaker zapa1=new Sneaker("67","predator",100,marca2,true,"grey&red",Map.of("42",4,"43",6,"44",3) );
        Sneaker zapa2=new Sneaker("69","uptempo",120,marca1,false,"pruple",Map.of("41",7,"40",8,"45",2) );

        Apparel prenda1= new Apparel("13","tech",100,marca1,"tela",Type.Hoodie);
        Apparel prenda2= new Apparel("26","shirt",50,marca1,"poliester",Type.TShirt);

        inventoryManager.addProduct(zapa1);
        inventoryManager.addProduct(zapa2);
        inventoryManager.addProduct(prenda1);
        inventoryManager.addProduct(prenda2);


    }

    public static void calcularTotalValue(InventoryManager inventoryManager) {

        for (Product  : inventoryManager) {

    }

}
