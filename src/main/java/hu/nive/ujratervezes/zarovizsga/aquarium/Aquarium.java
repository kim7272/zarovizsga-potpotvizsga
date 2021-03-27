package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aquarium {

    private List<Fish> fishes = new ArrayList<>();


    public List<String> getStatus(){
        List<String> totalStatus = new ArrayList<>();
        for (Fish fish : fishes){
            totalStatus.add(fish.status());
        }
        return totalStatus;
    }

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void removeFish() {
        List<Fish> fishsToRemove = new ArrayList<>();
        for (Fish fish : fishes){
            if (fish.getWeight() >= 11){
                fishsToRemove.add(fish);
            }
        }
        fishes.removeAll(fishsToRemove);
    }

    public void feed() {
        for (Fish fish: fishes){
            fish.feed();
        }
    }

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Clownfish clownfish = new Clownfish("Nemo", 5, "orange-white");
        Kong kong = new Kong("Kong", 10, "black");
        Tang tang = new Tang("Dory", 6, "blue");
        Tang tang2 = new Tang("Dory2", 6, "blue");
        Clownfish clownfish2 = new Clownfish("Nemo2", 10, "orange-white");
        aquarium.addFish(clownfish);
        aquarium.addFish(kong);
        aquarium.addFish(tang);
        aquarium.addFish(tang2);
        aquarium.addFish(clownfish2);
        aquarium.removeFish();

        System.out.println(aquarium.getStatus().size());

    }
}
