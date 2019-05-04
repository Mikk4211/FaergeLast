public class Car extends Vehicle{

    int vehicleWeight;

    // I opgaven beskrives der at getSpace skal være 1, og vi indtager derfor ikke space som parameter der kan ændres.

    public Car(int vehicleWeight){
        this.vehicleWeight = vehicleWeight;
    }

    @Override
    public int getWeightDistribution() {
        return vehicleWeight;
    }

    @Override
    public int getSpace() {
        return 1;
    }


    @Override
    public String toString() {
        return "Car Weight: " + vehicleWeight;
    }
}
