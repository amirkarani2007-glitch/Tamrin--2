public class Main {
    public static void main(String[] args) {

        RentalAgency agency = new RentalAgency("City Wheels");

        // 2. Add vehicles
        agency.addVehicle(new Car("ABC-123", "Toyota Camry", 50.0, 5));
        agency.addVehicle(new Motorcycle("MOTO-77", "Yamaha MT-07", 30.0, true));

    }
}
