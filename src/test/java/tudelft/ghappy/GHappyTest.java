package tudelft.ghappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//EJERCICIO 2 - ANDRE HUAROC TEST GHAPPY
public class GHappyTest {

    @Test
    public void allGsHappy() {
        assertTrue(new GHappy().gHappy("xxggxx"));
    }
    @Test
    public void singleGAtStart() {
        assertFalse(new GHappy().gHappy("gxx"));
    }
    @Test
    public void twoGsAtStart() {
        assertTrue(new GHappy().gHappy("ggxx"));
    }
    @Test
    public void emptyString() {
        assertTrue(new GHappy().gHappy(""));
    }

}
