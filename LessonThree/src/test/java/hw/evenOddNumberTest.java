package hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class evenOddNumberTest {
    taskOne evenNumber;

    @BeforeEach
    void setup() {
        evenNumber = new taskOne();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void checkEvenOddNumberTrue(int n){
//        assertThat(evenNumber.evenOddNumber(n)).isTrue();
        assertTrue(evenNumber.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    void checkEvenOddNumberFalse(int n){
//        assertThat(evenNumber.evenOddNumber(n)).isFalse();
        assertFalse(evenNumber.evenOddNumber(n));
    }

}
