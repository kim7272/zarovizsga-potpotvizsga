package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong extends Fish {

    private String name;
    private int weight;
    private String color;
    private boolean memoryLoss;

    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Kong(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public boolean hasMemoryLoss() {
       return this.memoryLoss;
    }

    @Override
    public void feed() {
        this.weight = this.weight + 2;
    }

    @Override
    public String status() {
        return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + memoryLoss;
    }
}
