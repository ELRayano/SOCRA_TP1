package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.epita.socra.app.Arabic.convert_to_arabic;
public class ArabicTest {

    @Test
    public void OneToArabic() {
        assertEquals(1, convert_to_arabic(". _ _ _ _"));
    }

    @Test
    public void TwoToArabic() {
        assertEquals(2, convert_to_arabic(". . _ _ _"));
    }

    @Test
    public void ThreeToArabic() {
        assertEquals(3, convert_to_arabic(". . . _ _"));
    }

    @Test
    public void FourToArabic() {
        assertEquals(4, convert_to_arabic(". . . . _"));
    }

    @Test
    public void FiveToArabic() {
        assertEquals(5, convert_to_arabic(". . . . ."));
    }

    @Test
    public void SixToArabic() {
        assertEquals(6, convert_to_arabic("_ . . . ."));
    }

    @Test
    public void SevenToArabic() {
        assertEquals(7, convert_to_arabic("_ _ . . ."));
    }

    @Test
    public void EightToArabic() {
        assertEquals(8, convert_to_arabic("_ _ _ . ."));
    }

    @Test
    public void NineToArabic() {
        assertEquals(9, convert_to_arabic("_ _ _ _ ."));
    }

    @Test
    public void ZeroToArabic() {
        assertEquals(0, convert_to_arabic("_ _ _ _ _"));
    }

    @Test
    public void TenToArabic() {
        assertEquals(10, convert_to_arabic(". _ _ _ _ _ _ _ _ _"));
    }

    @Test
    public void FortyTwoToArabic() {
        assertEquals(42, convert_to_arabic(". . . . _ . . _ _ _"));
    }

    @Test
    public void NineNineNineToArabic() {
        assertEquals(999, convert_to_arabic("_ _ _ _ . _ _ _ _ . _ _ _ _ ."));
    }

    @Test
    public void EightyThreeToArabic() {
        assertEquals(83, convert_to_arabic("_ _ _ . . . . . _ _"));
    }

    @Test
    public void OneNineOThreeToArabic() {
        assertEquals(1903, convert_to_arabic(". _ _ _ _ _ _ _ _ . _ _ _ _ _ . . . _ _"));
    }
}
