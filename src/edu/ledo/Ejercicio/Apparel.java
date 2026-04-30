package edu.ledo.Ejercicio;

public class Apparel extends Product{

    private String material;
    private Type type;

    public Apparel(int id, String modelName, int basePrice, Brand brand, String material, Type type) {
        super(id, modelName, basePrice, brand);
        this.material = material;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Apparel{" +
                "id='" + getId() + '\'' +
                ", modelName='" + getModelName() + '\'' +
                ", basePrice=" + getBasePrice() +
                ", brand=" + getBrand() +
                "material='" + material + '\'' +
                ", type=" + type +
                '}';

    }


}
