package com.wcs.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test
    public void executeShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertEquals("fizzFizz", fizzBuzzer.execute(3));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("buzzBuzz", fizzBuzzer.execute(5));
        assertEquals("buzz", fizzBuzzer.execute(10));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy15() {
        assertEquals("fizzbuzzBuzz", fizzBuzzer.execute(15));
        assertEquals("fizzbuzzFizz", fizzBuzzer.execute(30));
    }

    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
        assertEquals("7", fizzBuzzer.execute(7));
    }

    @Test
    public void executeShouldReturnWizzIfTheNumberIsDividableBy7() {
        assertEquals("Wizz", fizzBuzzer.execute(49));
        assertEquals("WizzWizz", fizzBuzzer.execute(77));
    }

    @Test
    public void executeShouldReturnBuzzWizzIfTheNumberIsDividableBy35() {
        assertEquals("BuzzWizzFizzBuzz", fizzBuzzer.execute(35));
        assertEquals("BuzzWizzWizz", fizzBuzzer.execute(70));
    }
    
    @Test
    public void executeShouldReturnFizzIfTheNumberCountains3() {
        assertEquals("Fizz", fizzBuzzer.execute(103));
        assertEquals("Fizz", fizzBuzzer.execute(38));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberCountains5() {
        assertEquals("Buzz", fizzBuzzer.execute(52));
        assertEquals("Buzz", fizzBuzzer.execute(59));
    }
    
     @Test
    public void executeShouldReturnWizzIfTheNumberCountains7() {
        assertEquals("Wizz", fizzBuzzer.execute(71));
        assertEquals("Wizz", fizzBuzzer.execute(79));
    }
}
