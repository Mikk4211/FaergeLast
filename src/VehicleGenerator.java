import java.util.ArrayList;

public class VehicleGenerator {

    public ArrayList<Vehicle> vehicleGenerator(int antalBiler) {
        // Lav forloop der genererer vehicles og ligger dem i et array
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        for (int i = 0; i < antalBiler; i++) {
            // Finder et tal mellem 1 og 100, for at kunne generere tilfældige antal vehicles efter %.
            int rand = (int) (Math.random() * 100) + 1;

            // 75% chance for Car
            if (rand < 75) {
                // Finder et tal mellem 800 og 2000, opgivet vægt for Car.
                int tempWeight = (int) (Math.random() * 1200) + 800;
                // Deklarerer og instansierer en ny Car med tempWeight.
                Car tempCar = new Car(tempWeight);
                // Tilføjer Car til arraylist.
                vehicles.add(tempCar);

            } else if (rand < 80) {
                int tempLoadWeight = (int) (Math.random() * 12000) + 3000;
                Truck tempTruck = new Truck(tempLoadWeight);
                vehicles.add(tempTruck);
            } else {
                int tempTruckWeight = (int) (Math.random() * 2000) + 1500;
                Truck tempTruckNoLoad = new Truck(tempTruckWeight);
                vehicles.add(tempTruckNoLoad);
            }
        }
        // Returnerer vehicles arrayet.
        return vehicles;
    }
}
