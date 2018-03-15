import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestQuadBike {

    QuadBike bike;

    @Before
    public void before(){
        bike = new QuadBike(30, 250, 60);
    }

    @Test
    public void bikeHasAverageSpeed(){
        assertEquals(30, bike.getAverageSpeed());
    }

    @Test
    public void bikeHasCC(){
        assertEquals(250, bike.getCC());
    }

    @Test
    public void bikeHasTopSpeed(){
        assertEquals(60, bike.getTopSpeed());
    }

}