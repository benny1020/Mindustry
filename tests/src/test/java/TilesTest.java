import mindustry.world.Tiles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TilesTest {


    @BeforeAll
    static void beforeAll() {
        ApplicationTests.launchApplication();
    }


    /*
     * Purpose: check point in boundary
     * Input: point(x,y)
     * Expected: return SUCCESS
     */

    @Test
    void checkInBoundTest() {
        Tiles tiles = new Tiles(5,5);

        System.out.println(tiles.in(4,4));
        Assertions.assertTrue(tiles.in(4,4) == true);
        Assertions.assertTrue(tiles.in(6,6) == false);
        Assertions.assertTrue(tiles.in(4,5) == false);
        Assertions.assertTrue(tiles.in(5,4) == false);
        Assertions.assertTrue(tiles.in(5,5) == false);


    }



}
