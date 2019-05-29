package com.epita.socra.app;

import org.junit.Test;

import static com.epita.socra.app.Sum.sum;
import static org.junit.Assert.assertEquals;

public class SumTest {
    @Test
    public void MorseSum5(){
        assertEquals(10, sum(5, ". . . . ."));
    }
    @Test
    public void ArabicSum5(){
        assertEquals( 10, sum(5, "5"));
    }

    @Test
    public void ArabicSum0(){
        assertEquals( 5, sum(5, "0"));
    }
    @Test
    public void MorseSum0(){
        assertEquals( 5, sum(5, "_ _ _ _ _"));
    }
    @Test
    public void ArabicSum999(){
        assertEquals( 999, sum(0, "999"));
    }
    @Test
    public void MorseSum999(){
        assertEquals( 999, sum(0, "_ _ _ _ . _ _ _ _ . _ _ _ _ ."));
    }
    @Test
    public void ArabicMultipleSum999(){
        int res = sum(0, "1");
        res = sum(res, "10");
        res = sum(res, "3");
        assert res == 14;
    }
    @Test
    public void MorseMultipleSum999(){
        int res = sum(0, "_ _ _ _ . _ _ _ _ . _ _ _ _ .");
        res = sum(res, ". . . . .");
        res = sum(res, ". _ _ _ _ _ _ _ _ _");
        assert res == 1014;
    }


}
