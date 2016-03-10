package VgenAbau;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class FrameTest extends TestCase {

    Frame f;

    @Before
    public void setUp() throws Exception {
        f = new Frame();
    }

    @Test
    public void testIsStrike() throws Exception {
        f.setLancer1(10);
        assertTrue(f.isStrike());
    }

    @Test
    public void testIsSpare() throws Exception {
        f.setLancer1(8);
        f.setLancer2(2);
        assertTrue(f.isSpare());
    }

    @Test
    public void testGetScore() throws Exception {
        f.setScore(4);
        assertEquals(f.getScore(), 4);
    }

    @Test
    public void testSetScore() throws Exception {
        f.setScore(10);
        assertEquals(f.getScore(), 10);
    }

    @Test
    public void testMAJScore() throws Exception {
        f.setScore(10);
        f.MAJScore(6);
        assertEquals(f.getScore(), 16);
    }
}