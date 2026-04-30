package edu.ledo.Ejercicio;

public class Brand {
    private final int PRESTIGEBYDEFAULT = 0;
    private String name;
    private String country;
    private int prestigeScore;

    public Brand(String name, String country, int prestigeScore) {
        this.name = name;
        this.country = country;
        this.checkPrestigebyDefault(prestigeScore);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrestigeScore() {
        return prestigeScore;
    }

    public void setPrestigeScore(int prestigeScore) {
        this.checkPrestigebyDefault(prestigeScore);
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", prestigeScore=" + prestigeScore +
                '}';
    }

    private void checkPrestigebyDefault(int prestigeScore) {
        if (prestigeScore > 0 && prestigeScore <= 10) {
            this.prestigeScore = prestigeScore;
        } else {
            System.out.println("la nota no esta entre los valores permitidos, por defecto se le asigna el valor 0");
            this.prestigeScore = PRESTIGEBYDEFAULT;
        }
    }
}
