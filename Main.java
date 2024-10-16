import repository.Car_Res;
import repository.CarService;
import UI.UI;

public class Main {
    public static void main(String[] args) {
        Car_Res carRepository = new Car_Res();
        CarService carService = new CarService(carRepository);

        UI ui = new UI(carService);
        ui.start();
    }
}
