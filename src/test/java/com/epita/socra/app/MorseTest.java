package com.epita.socra.app;

import org.junit.Test;

import static com.epita.socra.app.Morse.convert_to_morse;
import static org.junit.Assert.assertEquals;
public class MorseTest {
    @Test
     public void OneToMorse()
    {
        assertEquals(convert_to_morse(1), ". _ _ _ _");
    }
    @Test
     public void TwoToMorse()
    {
        assertEquals(convert_to_morse(2), ". . _ _ _");
    }
    @Test
     public void ThreeToMorse()
    {
        assertEquals(convert_to_morse(3), ". . . _ _");
    }
    @Test
     public void FourToMorse()
    {
        assertEquals(convert_to_morse(4), ". . . . _");
    }
    @Test
     public void FiveToMorse()
    {
        assertEquals(convert_to_morse(5), ". . . . .");
    }
    @Test
     public void SixToMorse()
    {
        assertEquals(convert_to_morse(6), "_ . . . .");
    }
    @Test
     public void SevenToMorse()
    {
        assertEquals(convert_to_morse(7), "_ _ . . .");
    }
    @Test
     public void EightToMorse()
    {
        assertEquals(convert_to_morse(8), "_ _ _ . .");
    }
    @Test
     public void NineToMorse()
    {
        assertEquals(convert_to_morse(9), "_ _ _ _ .");
    }
    @Test
     public void ZeroToMorse()
    {
        assertEquals(convert_to_morse(0), "_ _ _ _ _");
    }
    @Test
     public void TenToMorse()
    {
        assertEquals(convert_to_morse(10), ". _ _ _ _ _ _ _ _ _");
    }
    @Test
     public void FortyTwoToMorse()
    {
        assertEquals(convert_to_morse(42), ". . . . _ . . _ _ _");
    }
    @Test
     public void NineNineNineToMorse()
    {
        assertEquals(convert_to_morse(999), "_ _ _ _ . _ _ _ _ . _ _ _ _ .");
    }
    @Test
     public void EightyThreeToMorse()
    {
        assertEquals(convert_to_morse(83), "_ _ _ . . . . . _ _");
    }
    @Test
     public void OneNineOThreeToMorse() {
        assertEquals(convert_to_morse(1903), ". _ _ _ _ _ _ _ _ . _ _ _ _ _ . . . _ _");
    }
}
