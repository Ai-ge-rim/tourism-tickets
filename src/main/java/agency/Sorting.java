package agency;

import tour.Tour;

import java.util.Comparator;

public class Sorting implements Comparator<Tour> {

    /**
     * This method overrides method compare() of interface Comparator<>
     * and compares days of objects of type Tour
     *
     * @param tour1
     * @param tour2
     * @return
     */
    @Override
    public int compare(Tour tour1, Tour tour2) {
        return (int) (tour1.getDays() - tour2.getDays());
    }

}