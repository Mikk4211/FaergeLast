public class Main {

    public static void main(String[] args) {
        /*Car car = new Car(860);
        Truck truck = new Truck(12000);
        System.out.println(car.vehicleWeight);
        System.out.println(truck.loadWeight);*/
        VehicleGenerator vehicleGenerator = new VehicleGenerator();
        System.out.println(vehicleGenerator.vehicleGenerator());
        Car car = new Car(200);


    }


}
