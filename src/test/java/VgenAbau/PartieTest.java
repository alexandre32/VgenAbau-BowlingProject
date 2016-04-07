package VgenAbau;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {

    Partie p;

    @Before
    public void setUp() throws Exception {
        p = new Partie();
    }

    @Test
    public void testSetLancers(){
        p.setLancers(0,8,0);
        assertEquals(8, p.getLancers(0).getLancer1());
        assertEquals(0, p.getLancers(0).getLancer2());
    }

    @Test
    public void testGetLancers(){
        p.setLancers(0,10,0);
        assertEquals(10, p.getLancers(0).getLancer1());
    }

    @Test
    public void testGetLancersComplementaires(){
        p.setLancersComplementaires(10,0);
        assertEquals(10, p.getLancersComplementaires().getLancer1());
        assertEquals(0, p.getLancersComplementaires().getLancer2());
    }

    @Test
    public void testSetLancersComplementaires(){
        p.setLancersComplementaires(8,0);
        assertEquals(8, p.getLancersComplementaires().getLancer1());
        assertEquals(0, p.getLancersComplementaires().getLancer2());
    }

    @Test
    public void testFullStrike()
    {
        for (int i = 0; i < 10; ++i)
            p.setLancers(i,10,0);
        p.setLancersComplementaires(10,10);
        p.calculerScore();
        assertEquals(300, p.getScore());
    }

    @Test
    public void testFullSpare()
    {
        for (int i = 0; i<10; ++i)
            p.setLancers(i,5,5);
        p.setLancersComplementaires(5,0);
        p.calculerScore();
        assertEquals(150, p.getScore());
    }



    @Test
    public void testFullRien()
    {
        for (int i = 0; i<10; ++i)
            p.setLancers(i,9,0);
        p.calculerScore();
        assertEquals(90, p.getScore());
    }


    @Test
    public void testUnStrike()
    {
        p.setLancers(0,10,0);
        for (int i = 1; i < 10; ++i)
            p.setLancers(i,9,0);
        p.calculerScore();
        assertEquals(100, p.getScore());
    }







}