import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car, MachineData> carMap = new HashMap<>();

        Car car1 = new Car(1, "A123BC");
        MachineData carData1 = new MachineData(2010, "Toyota Camry", "10000 $", "Blue");
        carMap.put(car1, carData1);

        Car car2 = new Car(2, "B456DE");
        MachineData carData2 = new MachineData(2015, "Honda Civic", "15000 $", "Red");
        carMap.put(car2, carData2);

        for (Map.Entry<Car, MachineData> entry : carMap.entrySet()) {
            System.out.println("Car: " + entry.getKey().getNumberAuto() + "\n" + " Year: " +
                    entry.getValue().getYearOfManufacture()
                    + "\n" + " Model: " + entry.getValue().getModel() + "\n" + " Price: " +
                    entry.getValue().getPrice()
                    + "\n" + " Color: " + entry.getValue().getColor());
        }
    }
}