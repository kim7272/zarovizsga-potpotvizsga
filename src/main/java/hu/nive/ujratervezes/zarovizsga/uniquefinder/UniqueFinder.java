package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueFinder {

    public List<Character> uniqueChars(String s) {
        List<Character> letters = new ArrayList<>();
        if (s == null){
            throw new IllegalArgumentException("Invalid parameter!");
        }
        for (char c: s.toCharArray()) {
            if(!letters.contains(c)){
                letters.add(c);
            }
        }
        return letters;
    }
}
