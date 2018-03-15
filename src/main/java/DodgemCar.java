public class DodgemCar implements IDriveable{
    int averageSpeed;
    int seats;
    int topSpeed;

    public DodgemCar(int averageSpeed, int seats, int topSpeed){
        this.averageSpeed = averageSpeed;
        this.seats = seats;
        this.topSpeed = topSpeed;
    }

    @Override
    public int driveDistance(int distance) {
        return distance/averageSpeed;
    }

    @Override
    public int driveQuick(int distance) {
        return distance/topSpeed;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
