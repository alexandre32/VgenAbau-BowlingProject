package VgenAbau;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrameTest {

    Frame f;

    @Before
    public void setUp() throws Exception {
        f = new Frame();
    }

    @Test
    public void testSetLancer1() throws Exception {
        f.setLancer1(4);
        assertEquals(4, f.getLancer()[0]);
    }

    @Test
    public void testSetLancer2() throws Exception {
        f.setLancer2(4);
        assertEquals(4, f.getLancer()[1]);
    }

    @Test
    public void testIsStrike() throws Exception {
        f.setLancer1(10);
        assertTrue(f.isStrike());
    }

    @Test
    public void testIsSpare() throws Exception {
        f.setLancer1(4);
        f.setLancer2(6);
        assertTrue(f.isSpare());
    }

    @Test
    public void testGetLancer1() throws Exception {
        f.setLancer1(4);
        assertEquals(4, f.getLancer1());
    }

    @Test
    public void testGetLancer2() throws Exception {
        f.setLancer2(4);
        assertEquals(4, f.getLancer2());
    }

    @Test
    public void testGetLancer() throws Exception {
        f.setLancer1(4);
        f.setLancer2(4);
        assertEquals(4, f.getLancer1());
        assertEquals(4, f.getLancer2());
    }


}