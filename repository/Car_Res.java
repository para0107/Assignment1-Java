package repository;
import domain.Car;

import java.util.ArrayList;

public class Car_Res {
    public ArrayList<Car> list = null;

    public Car_Res() {
        this.list = new ArrayList<>();
    }

    public void add_car(Car c) {
        if (c.isAvailable()) {
            list.add(c);
            c.setAvailable(false);
        } else {
            System.out.println("This " + c + " car is unavailable.");
        }
    }

    public void cancel_reservation(Car c) {
        if (!c.isAvailable()) {
            list.remove(c);
            c.setAvailable(true);
        } else {
            System.out.println("This car is not reserved.");
        }
    }

    public void update_car(long id, int newYear, int newHp) {
        for (Car c : list) {
            if (c.getId() == id) {
                c.setYear(newYear);
                c.setHp(newHp);
                System.out.println("Car details updated: " + c);
                return;
            }
        }
        System.out.println("Car not found.");
    }

    public Car getCarById(long id) {
        for (Car c : list) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Car_Res{" +
                "list=" + list +
                '}';
    }
}
