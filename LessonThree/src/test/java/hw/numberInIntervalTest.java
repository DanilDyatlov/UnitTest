package hw;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class numberInIntervalTest {
    taskTwo numberInterval;

    @BeforeEach
    void setup() {
        numberInterval = new taskTwo();
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 42, 57, 99})
    void checkNumberInInterval(int n) {
//        assertThat(numberInterval.numberInOutInterval(n)).isTrue();
        assertTrue(numberInterval.numberInOutInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {23, 16, 1, 20})
    void checkNumberOutInterval(int n) {
//        assertThat(numberInterval.numberInOutInterval(n)).isFalse();
        assertFalse(numberInterval.numberInOutInterval(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {101, 403, 801, 999})
    void checkNumberOutIntervalTwo(int n) {
//        assertThat(numberInterval.numberInOutInterval(n)).isFalse();
        assertFalse(numberInterval.numberInOutInterval(n));
    }
}
