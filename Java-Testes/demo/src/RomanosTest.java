package demo.src;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanosTest {

    @Test
    public void testSingleNumerals() {
        Romanos roman = new Romanos();
        assertEquals(1, roman.romanToInt("I"));
        assertEquals(5, roman.romanToInt("V"));
        assertEquals(10, roman.romanToInt("X"));
        assertEquals(50, roman.romanToInt("L"));
        assertEquals(100, roman.romanToInt("C"));
        assertEquals(500, roman.romanToInt("D"));
        assertEquals(1000, roman.romanToInt("M"));
    }

    @Test
    public void testMultipleSameNumerals() {
        Romanos roman = new Romanos();
        assertEquals(2, roman.romanToInt("II"));
        assertEquals(20, roman.romanToInt("XX"));
        assertEquals(300, roman.romanToInt("CCC"));
    }

    @Test
    public void testDifferentNumerals() {
        Romanos roman = new Romanos();
        assertEquals(6, roman.romanToInt("VI"));
        assertEquals(15, roman.romanToInt("XV"));
        assertEquals(30, roman.romanToInt("XXX"));
    }

    @Test
    public void testSubtractiveNotation() {
        Romanos roman = new Romanos();
        assertEquals(4, roman.romanToInt("IV"));
        assertEquals(9, roman.romanToInt("IX"));
        assertEquals(14, roman.romanToInt("XIV"));
        assertEquals(40, roman.romanToInt("XL"));
        assertEquals(90, roman.romanToInt("XC"));
        assertEquals(400, roman.romanToInt("CD"));
        assertEquals(900, roman.romanToInt("CM"));
    }

    @Test
    public void testInvalidNumerals() {
        Romanos roman = new Romanos();
        assertThrows(IllegalArgumentException.class, () -> roman.romanToInt(null));
        assertThrows(IllegalArgumentException.class, () -> roman.romanToInt(""));
        assertThrows(IllegalArgumentException.class, () -> roman.romanToInt("IIII"));
        assertThrows(IllegalArgumentException.class, () -> roman.romanToInt("VV"));
        assertThrows(IllegalArgumentException.class, () -> roman.romanToInt("IC"));
    }
}
