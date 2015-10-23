package agency;

import tour.*;

public class Factory {
    public static Tour proposeTour(String type){
        Tour t;
        switch (type) {
            case "Cruise":
                return new Cruise("Blue Lagoon", "Ship", "Seafood", 7);

            case "Guided":
                t = new Guided("Europe Guided Tour", "Bus", "Vegetarian", 10);
                break;
            case "shortGuided":
                t = new Guided("Europe Guided Tour", "Bus", "Fast Food", 5);
                break;
            case "Resort":
                t = new Resort("Turkey Resort", "Limousine", "Vegetarian", 12);
                break;
            case "Shopping":
                t = new Shopping("China Shopping", "Bus", "FastFood", 5);
                break;
            default:
                t = null;
                break;
        }
        return t;
    }


    }

