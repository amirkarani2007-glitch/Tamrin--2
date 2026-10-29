import java.util.ArrayList;
import java.util.List;


public class RentalAgency {

    private String agencyName;
    private List<Vehicle> fleet;

    public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            fleet.add(vehicle);
        }
    }

    // private helper: find a vehicle by license plate
    private Vehicle findVehicle(String licensePlate) {
        for (Vehicle v : fleet) {
            if (v.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return v;
            }
        }
        return null;
    }
}
