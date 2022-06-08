import mindustry.content.Blocks;
import mindustry.world.Tile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TileTest {


    @BeforeAll
    static void beforeAll() {
        ApplicationTests.launchApplication();
    }
    /*
     * Purpose: check tile create
     * Input: tile's x, y
     * Expected: return SUCCESS
     */

    @Test
    void checkTilePosTest() {
        Tile tile1 = new Tile(3,4);
        Assertions.assertTrue(tile1.pos()>=0);
    }


}
