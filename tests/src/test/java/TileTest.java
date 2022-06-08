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
        Tile tile = new Tile(3,4);
        Assertions.assertTrue(tile.pos()>=0);
    }

    /*
     * Purpose: check tile Block fill with Blocks.air
     * Input: tile's x, y
     * Expected: return SUCCESS
     */

    @Test
    void checkTileBlockTest() {
        Tile tile = new Tile(5,5);
        Assertions.assertTrue(tile.block()==Blocks.air);
    }



}
