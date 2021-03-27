package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String input, char x) {
        if (x != '0' && x != '1' && x != 'x') {
            throw new IllegalArgumentException("Invalid parameter!");
        }
        int result = 0;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(input))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int count = 0;
                for (char c : line.toCharArray()) {
                    if (c == x) {
                        count++;
                    }
                }
                result = result + count;
            }

        } catch (IOException e) {
           throw new IllegalStateException("Can not read file!", e);
        }
        return result;
    }
}
