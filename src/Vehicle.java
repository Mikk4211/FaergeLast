public abstract class Vehicle implements Comparable {

    int vehicleWeight;

    // Laver abstract metoder til brug i de forskellige klasser.

    public abstract int getWeightDistribution();

    public abstract int getSpace();

    // Jeg laver en toString metode, for at kunne læse bilernes vægt ud fra arraylisten.
    @Override
    public abstract String toString();

    // Metode fra Comparable, denne bruges til at sammenligne objecter.
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
