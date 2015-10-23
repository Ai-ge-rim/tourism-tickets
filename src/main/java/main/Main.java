package main;

import agency.Factory;
import agency.Operator;
import agency.Sorting;
import tour.Tour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our Trip agency!" + "\n");

        List<Tour> vacation = new ArrayList<>();
        Factory tourFactory = new Factory();
        Operator operator = new Operator();


        operator.addCruise(vacation);
        operator.addGuided(vacation);
        operator.addResort(vacation);
        operator.addShopping(vacation);


        operator.printVacation(vacation);

        Collections.sort(vacation, new Sorting());
        operator.printSortedDays(vacation);


        List<Tour> found = operator.sortTourByDays(5, 12, vacation);
        operator.printFoundDays(found);


        found = operator.searchTourWithVegetarianFood("Vegetarian", vacation);
        operator.printFoundFood(found);

        found = operator.searchTourWithBusTransport("Bus", vacation);
        operator.printFoundTransport(found);

        System.out.println("\n"+"Please choose one of the proposed tours an contact our agency!" +"\n");
    }
}



