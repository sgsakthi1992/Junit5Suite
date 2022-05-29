package com.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenNumberCheckerTest {
    private EvenNumberChecker evenNumberChecker;

    @BeforeEach
    void setUp() {
        evenNumberChecker = new EvenNumberChecker();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void evenNumberTest(int number) {
        var result = evenNumberChecker.isNumberEven(number);
        assertTrue(result);
    }
}
