package ex1.main;

import ex1.classes.Restaurant;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /*Crea una classe anomenada Restaurant amb dos atributs: nom(String)
        i puntuació(int). Implementa els mètodes necessaris perquè no es puguin
        introduir objectes Restaurant amb el mateix nom i la mateixa puntuació
        en un HashSet creat en el main() de l’aplicació.¡
                Important
        Pot haver-hi restaurants amb el mateix nom amb diferent puntuació, però
        no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.;*/

        HashSet<Restaurant> restaurants = new HashSet<>();
        Restaurant rest1 = new Restaurant("Pepito", 8);
        Restaurant rest2 = new Restaurant("Pepito", 7);
        Restaurant rest3 = new Restaurant("Pepito", 8);

        restaurants.add(rest1);
        restaurants.add(rest2);
        restaurants.add(rest3);

        for (Restaurant restaurant : restaurants)
        {
            System.out.println(restaurant.getName());
        }

    }
}