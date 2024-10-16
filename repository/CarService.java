package repository;

import domain.Car;
import java.util.List;

public class CarService {

    private final Car_Res carRes;

    public CarService(Car_Res carRes) {
        this.carRes = carRes;
    }

    public void addCar(Car car) {
        carRes.add_car(car);
    }

    public Car getCarById(long id) {
        return carRes.getCarById(id);
    }

    public void updateCar(long id, int year, int horsepower) {
        carRes.update_car(id, year, horsepower);
    }

    public boolean cancelReservation(long id) {
        Car car = carRes.getCarById(id);
        if (car != null) {
            carRes.cancel_reservation(car);
            return true;
        }
        return false;
    }

    public List<Car> getAllCars() {
        return carRes.list;
    }
}
