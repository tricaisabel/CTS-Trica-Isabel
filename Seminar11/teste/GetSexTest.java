package teste;

import exceptii.CNPInvalidException;
import org.junit.Assert;
import org.junit.Test;
import clase.Persoana;


import static org.junit.Assert.*;

public class GetSexTest {
    @Test
    public void getSexRight(){
        Persoana pF=new Persoana("Iulia","62345");
        Assert.assertEquals("F",pF.getSex());
        Persoana pM=new Persoana("Matei","52457");
        Assert.assertEquals("M",pM.getSex());
    }

    @Test
    public void getSexBoundaryInf(){
        Persoana pF=new Persoana("Iulia","12345");
        Assert.assertEquals("M",pF.getSex());
    }

    @Test
    public void getSexBoundarySup(){
        Persoana pF=new Persoana("Iulia","62345");
        Assert.assertEquals("F",pF.getSex());
    }

    @Test
    public void getSexCrossCheck(){
        Persoana pM=new Persoana("Andrei","52345");
        int primaCifra=pM.CNP.charAt(0);
        Assert.assertEquals(primaCifra%2==0?"F":"M",pM.getSex());
    }

    @Test
    public void testGetSexShouldThrowException(){
        Persoana pM=new Persoana("Andrei","02345");
        try{
            pM.getSex();
            fail("Metoda nu arunca exceptie");
        }
        catch(CNPInvalidException exceptie){

        }
    }

    @Test(expected = CNPInvalidException.class)
    public void testGetSexShouldThrowExceptionJunit4(){
        Persoana pM=new Persoana("Andrei","02345");
        pM.getSex();
    }

    @Test(expected = NullPointerException.class)
    public void testGetSexShouldThrowNullException(){
        Persoana pM=new Persoana("Andrei",null);
        pM.getSex();
    }

    @Test(timeout = 100)
    public void testGetSexPerformance(){
        Persoana pM=new Persoana("Andrei","52345");
        pM.getSex();
    }

    @Test
    public void testGetSexFormat(){
        Persoana pM=new Persoana("Andrei","52345");
        assertEquals(1,pM.getSex().length());
    }

    @Test
    public void testGetSexRange(){
        Persoana pM=new Persoana("Andrei","82345");
        assertEquals("N/A",pM.getSex());
    }


}