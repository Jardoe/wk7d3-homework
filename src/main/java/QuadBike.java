public class QuadBike implements IDriveable{
    int averageSpeed;
    int cc;
    int topSpeed;

    public QuadBike(int averageSpeed, int cc, int topSpeed){
        this.averageSpeed = averageSpeed;
        this.cc = cc;
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

    public int getCC() {
        return cc;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
