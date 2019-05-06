public class Main {

    public static void main(String[] args) {
        /*Car car = new Car(860);
        Truck truck = new Truck(12000);
        System.out.println(car.vehicleWeight);
        System.out.println(truck.loadWeight);*/
        VehicleGenerator vehicleGenerator = new VehicleGenerator();
        System.out.println(vehicleGenerator.vehicleGenerator(100));
        Car car1 = new Car(600);
        Car car2 = new Car(600);

        System.out.println(car1.compareTo(car2));
        System.out.println(car2.vehicleWeight);
    }


}
