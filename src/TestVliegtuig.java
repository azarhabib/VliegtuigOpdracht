import org.junit.Assert;
import org.junit.Test;
public class TestVliegtuig {
private Luchthaven schiphol = new Luchthaven();

    @org.junit.Test
    public void magOpstijgen() {
        //er wordt getest of de vliegtuig mag opstijgen
        Assert.assertFalse(schiphol.kanOpstijgen(false, 500, 40 ));
        Assert.assertFalse(schiphol.kanOpstijgen(false, 600, 45 ));
        Assert.assertTrue(schiphol.kanOpstijgen(true, 1100, 55));
        Assert.assertTrue(schiphol.kanOpstijgen(true, 1200, 60));
        Assert.assertTrue(schiphol.kanOpstijgen(true, 550, 30));
    }
}
