package ex2.main;

import ex2.classes.Restaurant;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant rest1 = new Restaurant("Alb", 8);
        Restaurant rest2 = new Restaurant("Olb", 5);
        Restaurant rest3 = new Restaurant("Old", 7);
        Restaurant rest4 = new Restaurant("Eld", 4);

        restaurants.add(rest1);
        restaurants.add(rest2);
        restaurants.add(rest3);
        restaurants.add(rest4);

        TreeSet<Restaurant> sortedRestaurants = new TreeSet<>(restaurants);

        for (Restaurant rest : sortedRestaurants){
            System.out.println(rest.getName());
            System.out.println(rest.getScore());
        }
    }
}
