package org.learning.java;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(4, Calculator.add(2,2), "andata male");
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(0, Calculator.subtract(2,2), "andata male");
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(4, Calculator.multiply(2,2), "andata male");
    }

    @org.junit.jupiter.api.Test
    void divide() {
        try {
            assertEquals(1, Calculator.divide(2,0));
        } catch (IllegalArgumentException e) {
            System.out.println("il numero deve essere diverso da 0");
        }
        // assertThrows
    }
}