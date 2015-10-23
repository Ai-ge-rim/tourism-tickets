package agency;

import tour.Tour;

import java.util.List;

public class Print extends Operator {
    public void printFoundFood(List<Tour> vacation) {
        System.out.println();
        System.out.println("The tour with vegetarian food: ");
        for (Tour tour : vacation) {
            System.out.print("The tour's name - " + tour.getName()
                    + ", food -" + tour.getFood("Vegetarian") + "\n");
        }
    }

    public void printFoundDays(List<Tour> vacation) {
        System.out.println();
        System.out.println("The sorted days by duration: ");
        for (Tour tour : vacation) {
            System.out.print("The tour's name - " + tour.getName()
                    + ", days - " + tour.getDays() + "\n");
        }
    }

    public void printVacation(List<Tour> vacation) {
        System.out.println("Proposed vacations: ");
        for (Tour tour : vacation) {
            System.out.print("The proposed tour is " + tour.getName()
                    + ", days : " + tour.getDays()
                    + ", transport: " + tour.getTransport("Bus")
                    + ", food: " + tour.getFood("Vegetarian")  + "\n");
        }
    }
    public void printSortedDays(List<Tour> vacation) {
    }



}
