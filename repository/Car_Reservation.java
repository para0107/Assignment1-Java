package repository;

import domain.Car;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//
//public class Car_Reservation {
//    private Map<Boolean, Car> cars = new HashMap<>();
//
//    // Add a car
//    public void add(Car car) {
//        if (car.isAvaliable() == true) {
//            car.setAvaliable(false);
//            cars.put(car.isAvaliable(), car);
//        }
//        else
//            System.out.println("Car is unavaliable");
//    }
//
//    // Get all cars
//    public Map<Boolean, Car> getAll() {
//        return cars;
//    }
//
//    @Override
//    public String toString() {
//        return "Car_Reservation{" +
//                "cars=" + cars +
//                '}';
//    }
//
//    // Remove a car
//    public void delete(Car car) {
//        cars.remove(car.isAvaliable(),car);
//    }
//}
