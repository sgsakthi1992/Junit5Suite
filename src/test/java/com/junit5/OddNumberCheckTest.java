package com.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;

class OddNumberCheckTest {
    private EvenNumberChecker evenNumberChecker;

    @BeforeEach
    void setUp() {
        evenNumberChecker = new EvenNumberChecker();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void oddNumberTest(int number) {
        var result = evenNumberChecker.isNumberEven(number);
        assertFalse(result);
    }
}
