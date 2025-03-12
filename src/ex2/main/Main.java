package ex2.main;

import ex2.classes.Restaurant;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Crea una classe anomenada Restaurant amb dos atributs: nom(String)
        i puntuació(int). Implementa els mètodes necessaris perquè no es puguin
        introduir objectes Restaurant amb el mateix nom i la mateixa puntuació
        en un HashSet creat en el main() de l’aplicació.¡
                Important
        Pot haver-hi restaurants amb el mateix nom amb diferent puntuació, però
        no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.;

        EX2
        Utilitzant la classe del programa anterior, crea la implementació necessària
        perquè els objectes de la classe Restaurant estiguin ordenats per nom i per
        puntuació en ordre descendent. */

        HashSet<Restaurant> restaurants = new HashSet<>();
        Restaurant rest1 = new Restaurant("Alb", 8);
        Restaurant rest2 = new Restaurant("Elb", 9);
        Restaurant rest3 = new Restaurant("Old", 7);

        restaurants.add(rest1);
        restaurants.add(rest2);
        restaurants.add(rest3);

        TreeSet<Restaurant> sortedRestaurants = new TreeSet<>(restaurants);

        System.out.println(sortedRestaurants);


    }
}
