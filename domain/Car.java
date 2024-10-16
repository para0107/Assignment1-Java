package domain;

public class Car {
    private long id;           // Unique ID for each car
    private String model;
    private int year;
    private int hp;
    private boolean available;

    public Car(long id, String model, int year, int hp) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.hp = hp;
        this.available = true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hp=" + hp +
                ", available=" + available +
                '}';
    }
}
