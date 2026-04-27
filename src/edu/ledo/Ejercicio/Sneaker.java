package edu.ledo.Ejercicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sneaker extends Product{

    private boolean isLimitedEdition;
    private String colorWay;
    private Map<String,Integer> sizesStock=new HashMap<>();

    public Sneaker(String id, String modelName, int basePrice, Brand brand, boolean isLimitedEdition, String colorWay, Map<String, Integer> sizesStock) {
        super(id, modelName, basePrice, brand);
        this.isLimitedEdition = isLimitedEdition;
        this.colorWay = colorWay;
        this.sizesStock = sizesStock;
    }


    public String getColorWay() {
        return colorWay;
    }

    public void setColorWay(String colorWay) {
        this.colorWay = colorWay;
    }

    public boolean isLimitedEdition() {
        return isLimitedEdition;
    }

    public void setLimitedEdition(boolean limitedEdition) {
        isLimitedEdition = limitedEdition;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "isLimitedEdition=" + isLimitedEdition +
                ", colorWay='" + colorWay + '\'' +
                '}';
    }
}
