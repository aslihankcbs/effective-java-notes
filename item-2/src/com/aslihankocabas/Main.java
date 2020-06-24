package com.aslihankocabas;

public class Main {

    public static void main(String[] args) {

        NutritionFacts cocoCola = new NutritionFacts.Builder(240, 8).
                calories(100).fat(3).sodium(35).carbonhydrate(27).build();
        System.out.println(cocoCola);
    }
}
