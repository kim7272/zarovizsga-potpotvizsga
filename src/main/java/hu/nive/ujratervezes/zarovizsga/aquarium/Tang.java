package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang extends Fish {

    private String name;
    private int weight;
    private String color;
    private boolean memoryLoss = hasMemoryLoss();


    public Tang(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isMemoryLoss() {
        return memoryLoss;
    }

    public boolean hasMemoryLoss() {
       return true;
    }

    @Override
    public void feed() {
        this.weight = this.weight + 1;
    }

    @Override
    public String status() {
        return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + memoryLoss;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
