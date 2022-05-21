package teste;
import org.junit.Assert;

import clase.Persoana;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class GetVarstaTest {
    @Test(timeout = 150)
    public void getVarstaPerformance() {
        Persoana p = new Persoana("Mara", "6000831460011");
        p.getVarsta();

    }

    @Test
    public void getVarstaOrder(){
        Persoana p1 = new Persoana("Mara", "6000831460011");
        Persoana p2 = new Persoana("Mara", "6010831460011");
        assertTrue(p1.getVarsta()>p2.getVarsta());
    }

    @Test
    public void getVarstaCardinality1() {
        Persoana p = new Persoana("Mara", "6200831460011");
        assertEquals(1,p.getVarsta());
    }
}
