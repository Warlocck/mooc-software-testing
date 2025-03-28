package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//EJERCICIO 3 - ANDRE HUAROC IMPLEMENTACION DEL TEST
public class CaesarShiftCipherTest {
    @Test
    public void basicShiftPositive() {
        assertEquals("def", CaesarShiftCipher.CaesarShiftCipher("abc", 3));
    }

    @Test
    public void basicShiftNegative() {
        assertEquals("xyz", CaesarShiftCipher.CaesarShiftCipher("abc", -3));
    }

    @Test
    public void wrapAroundZtoA() {
        assertEquals("abc", CaesarShiftCipher.CaesarShiftCipher("xyz", 3));
        assertEquals("zab", CaesarShiftCipher.CaesarShiftCipher("xyz", 2));
    }

    @Test
    public void maintainSpaces() {
        assertEquals("def ghi", CaesarShiftCipher.CaesarShiftCipher("abc def", 3));
        assertEquals("   ", CaesarShiftCipher.CaesarShiftCipher("   ", 5));
    }

    @Test
    public void invalidCharacters() {
        assertEquals("invalid", CaesarShiftCipher.CaesarShiftCipher("ab12c", 3));
        assertEquals("invalid", CaesarShiftCipher.CaesarShiftCipher("ABC", 1));
    }

    @Test
    public void emptyMessage() {
        assertEquals("", CaesarShiftCipher.CaesarShiftCipher("", 5));
    }

    @Test
    public void nullMessage() {
        assertEquals("invalid", CaesarShiftCipher.CaesarShiftCipher(null, 3));
    }
}