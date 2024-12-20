package com.stringcalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExpressionEvaluatorTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, ExpressionEvaluator.evaluate("")); // Chaîne vide retourne 0
    }
}
