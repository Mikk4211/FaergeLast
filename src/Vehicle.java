public abstract class Vehicle implements Comparable<Object> {

    int vehicleWeight;

    // Laver abstract metoder til brug i de forskellige klasser.

    public abstract int getWeightDistribution();

    public abstract int getSpace();

    // Jeg laver en toString metode, for at kunne læse bilernes vægt ud fra arraylisten.
    @Override
    public abstract String toString();

    // Metode fra Comparable, denne bruges til at sammenligne objecter.

    @Override
    public int compareTo(Vehicle vehicle) {
        if (this.vehicleWeight > vehicle.vehicleWeight){
            return 1;
        }
        else if (this.vehicleWeight < vehicle.vehicleWeight){
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
