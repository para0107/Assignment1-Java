package UI;

import domain.Car;
import repository.Car_Res;
import repository.CarService;

import java.util.Scanner;

public class UI {
    private final CarService carService;
    private final Scanner scanner = new Scanner(System.in);

    public UI(CarService carService) {
        this.carService = carService;
    }

    public void start() {
        while (true) {
            System.out.println("\n1. Add Car\n2. View Car\n3. Update Car\n4. Cancel Reservation\n5. List All Cars\n6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (option) {
                case 1:
                    addCar();
                    break;
                case 2:
                    viewCar();
                    break;
                case 3:
                    updateCar();
                    break;
                case 4:
                    cancelReservation();
                    break;
                case 5:
                    listAllCars();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
    }

    private void addCar() {
        long id = getIntInput("Enter car ID: ");
        scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        int year = getIntInput("Enter year: ");
        int horsepower = getIntInput("Enter horsepower: ");

        Car car = new Car(id, model, year, horsepower);
        carService.addCar(car);
        System.out.println("Car added successfully!");
    }

    private void viewCar() {
        long id = getIntInput("Enter car ID: ");
        Car car = carService.getCarById(id);
        if (car != null) {
            System.out.println("Car Details: " + car);
        } else {
            System.out.println("Car not found.");
        }
    }

    private void updateCar() {
        long id = getIntInput("Enter car ID to update: ");
        int year = getIntInput("Enter new year: ");
        int horsepower = getIntInput("Enter new horsepower: ");
        carService.updateCar(id, year, horsepower);
        System.out.println("Car updated successfully!");
    }

    private void cancelReservation() {
        long id = getIntInput("Enter car ID to cancel reservation: ");
        if (carService.cancelReservation(id)) {
            System.out.println("Reservation cancelled successfully.");
        } else {
            System.out.println("Car not found or already available.");
        }
    }

    private void listAllCars() {
        System.out.println("Listing all cars:");
        for (Car car : carService.getAllCars()) {
            System.out.println(car);
        }
    }

    private int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next(); // Consume the invalid input
            System.out.println("Invalid input. Please enter a valid integer.");
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }
}
