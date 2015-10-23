package agency;

import tour.Tour;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Operator {
    public List<Tour> addCruise(List<Tour> vacation) {
        for (int i = 0; i < 1; i++) {
            Tour tour = Factory.proposeTour("Cruise");
            vacation.add(tour);
        }
        return vacation;

    }

    public List<Tour> addGuided (List<Tour> vacation) {
        for (int j = 0; j < 1; j++) {
            Tour tour = Factory.proposeTour("Guided");
            vacation.add(tour);
        }
        return vacation;
    }

    public List<Tour> addResort (List<Tour> vacation) {
        for (int k = 0; k < 1; k++) {
            Tour tour = Factory.proposeTour("Resort");
            vacation.add(tour);
        }
        return vacation;
    }

    public List<Tour> addShopping (List<Tour> vacation) {
        for (int m = 0; m < 1; m++) {
            Tour tour = Factory.proposeTour("Shopping");
            vacation.add(tour);
        }
        return vacation;
    }

    public void printVacation(List<Tour> vacation) {
        System.out.println("The Proposed vacations: ");
        for (Tour tour : vacation) {
            System.out.print("The proposed tour is " + tour.getName()
                    + ", days : " + tour.getDays()
                    + ", transport: " + tour.getTransport("Bus")
                    + ", food: " + tour.getFood("Vegetarian")  + "\n");
        }
    }

    public List<Tour> sortTourByDays(int min, int max, List<Tour> vacation) {
        List<Tour> result = new ArrayList<>();
        for (Tour tour : vacation) {
            boolean isAcceptable = tour.getDays() >= min && tour.getDays() <= max;
            if (isAcceptable) {
                result.add(tour);
            }
        }
        return result;
    }

    public void printFoundDays(List<Tour> vacation) {
        System.out.println();
        System.out.println("The  days sorted by duration: ");
        for (Tour tour : vacation) {
            System.out.print("The tour's name - " + tour.getName()
                    + ", days - " + tour.getDays() + "\n");
        }
    }


    public void printSortedDays(List<Tour> vacation) {
    }

    public List<Tour> searchTourWithVegetarianFood(String veg, List<Tour> vacation) {
        List<Tour> result = new ArrayList<>();
        for (Tour tour: vacation) {

            boolean isAcceptable = Objects.equals(tour.getFood("Vegetarian"), veg);
            if (isAcceptable) {
                result.add(tour);
            }
        }
        return result;
    }

    public void printFoundFood(List<Tour> vacation) {
        System.out.println();
        System.out.println("The tours with vegetarian food are: ");
        for (Tour tour : vacation) {
            System.out.print("The tour's name - " + tour.getName()
                    + ", food -" + tour.getFood("Vegetarian") + "\n");
        }
    }

    public List<Tour> searchTourWithBusTransport(String bus, List<Tour> vacation) {
        List<Tour> result = new ArrayList<>();
        for (Tour tour: vacation) {
            boolean isAcceptable = tour.getTransport("Bus") == bus;//equals !
            if (isAcceptable) {
                result.add(tour);
            }
        }
        return result;
    }

    public void printFoundTransport(List<Tour> vacation) {
        System.out.println();
        System.out.println("The tours with bus transport are: ");
        for (Tour tour : vacation) {
            System.out.print("The tour's name - " + tour.getName()
                    + ", transport -" + tour.getTransport("Bus") + "\n");
        }
    }




}
