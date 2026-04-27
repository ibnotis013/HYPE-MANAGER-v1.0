package edu.ledo.Ejercicio;

public abstract class Product {


    private String id;
    private String modelName;
    private int basePrice;
    private Brand brand;

    public Product(String id, String modelName, int basePrice, Brand brand) {
        this.id = id;
        this.modelName = modelName;
        this.basePrice = basePrice;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", modelName='" + modelName + '\'' +
                ", basePrice=" + basePrice +
                ", brand=" + brand +
                '}';
    }
}
