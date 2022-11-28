import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterbottle;

    @Before
    public void before() { waterbottle = new WaterBottle(100); }
    
    @Test
    public void checkVolumeStartsAt100() {
        assertEquals(100, waterbottle.volumeStartsAt100());
    }

    @Test
    public void checkDrinkRemoves10FromVolume() {
        assertEquals(90, waterbottle.drinkRemoves10FromVolume());
    }

    @Test
    public void checkWaterBottleCanBeEmptied() {
        assertEquals(0, waterbottle.emptyBottle());
    }

    @Test
    public void checkWaterBottleCanBeRefilled() {
        assertEquals(100, waterbottle.fillBottle());
    }

}
