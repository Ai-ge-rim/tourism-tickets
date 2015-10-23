package tour;

public class Tour {
    private String name;
    private String transport;
    private int days;
    private String food;

    public Tour(String name, String transport, String food, int days) {
        this.name = name;
        this.transport = transport;
        this.food = food;
        this.days = days;
    }


    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getFood(String vegetarian) {
        return food;
    }

    public String getTransport(String bus) {
        return transport;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                ", days=" + days +
                ", food=" + food +
                '}';
    }



}
