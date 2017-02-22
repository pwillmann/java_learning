import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Patrick on 22.02.2017.
 */
class CalculatorTest {
    static Calculator calculator;

    @BeforeAll
    static void setup(){
        calculator = new Calculator();
    }

    @AfterAll
    static void teardown(){
        // unnecessary
        calculator = null;
    }

    @Test
    @DisplayName("My 1st JUnit 5 test! 😎")
    void add(TestInfo testInfo) {
        assertEquals(2, calculator.add(1,1), "1 + 1 should equal 2");
        assertEquals("My 1st JUnit 5 test! 😎", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");

    }

}