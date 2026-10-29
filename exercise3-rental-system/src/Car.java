public class Car extends Vehicle {

    private static final double serviceFee = 15.0;

    private int numberOfSeats;

    public Car(String licensePlate, String model, double dailyRate, int numberOfSeats) {
        super(licensePlate, model, dailyRate);
        this.numberOfSeats = numberOfSeats;
    }
}
