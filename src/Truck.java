public class Truck extends Vehicle {

    public int loadSpace, loadWeight;

    public Truck(int loadWeight) {
        this.loadWeight = loadWeight;
    }


    @Override
    public int getWeightDistribution() {
        // Returnerer værdi som beskrevet i opgaven.
        return (vehicleWeight+loadWeight)/(1+loadSpace);
    }

    @Override
    public int getSpace() {
        return 1+loadSpace;
    }

    @Override
    public String toString() {
        return "Truck Load Weight: " +loadWeight;
    }
}
