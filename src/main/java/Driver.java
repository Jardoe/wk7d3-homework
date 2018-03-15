public class Driver {
    String name;
    IDriveable vehicle;

    public Driver(String name, IDriveable vehicle){
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public IDriveable getVehicle() {
        return vehicle;
    }

    public int driveVehicle(int distance) {
        return this.vehicle.driveDistance(distance);
    }

    public void changeVehicle(IDriveable vehicle) {
        this.vehicle = vehicle;
    }

    public int driveQuick(int distance){
        return this.vehicle.driveQuick(distance);
    }
}
