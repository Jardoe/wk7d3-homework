import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDodgemCar {

    DodgemCar car;

    @Before
    public void before(){
        this.car = new DodgemCar(20, 2, 40);
    }

    @Test
    public void carHasAverageSpeed(){
        assertEquals(20, car.getAverageSpeed());
    }

    @Test
    public void carHasSeats(){
        assertEquals(2, car.getSeats());
    }

    @Test
    public void carHasTopSpeed(){
        assertEquals(40, car.getTopSpeed());
    }


}