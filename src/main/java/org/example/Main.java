package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("NIRBHAY", "SALONI", "BANSAL");
        Grid grid = new Grid(20);
        grid.fillGrid(words);
        grid.displayGrid();


    }
}