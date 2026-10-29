public class Motorcycle extends Vehicle {

    private static final int longTermDays = 7;
    private static final double discountRate = 0.10; // 10% discount

    private boolean hasHelmetIncluded;

    public Motorcycle(String licensePlate, String model, double dailyRate, boolean hasHelmetIncluded) {
        super(licensePlate, model, dailyRate);
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

}
