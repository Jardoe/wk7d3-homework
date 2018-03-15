import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDriver {

    Driver driver;
    DodgemCar car;
    QuadBike bike;

    @Before
    public void before(){
        car = new DodgemCar(20, 2, 40);
        driver = new Driver("Steve", car);
        bike = new QuadBike(30, 250, 60);

    }

    @Test
    public void driverHasName(){
        assertEquals("Steve", driver.getName());
    }

    @Test
    public void driverHasVehicle(){
        assertEquals(car, driver.getVehicle());
    }

    @Test
    public void driverCanDrive(){
        assertEquals(2, driver.driveVehicle(40));
    }

    @Test
    public void driverCanChangeVehicle(){
        driver.changeVehicle(bike);
        assertEquals(bike, driver.getVehicle());
    }

    @Test
    public void driverCanDriveQuick(){
        assertEquals(1, driver.driveQuick(40));
    }

}