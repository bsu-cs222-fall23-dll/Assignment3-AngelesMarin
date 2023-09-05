package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SillyMethodsTest {

    @Test
    public void testDidGuess42Correctly() {
        SillyMethods sillyMethods = new SillyMethods();
        boolean result = sillyMethods.didGuess42(42);
        Assertions.assertTrue(result);
    }
}
