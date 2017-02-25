package effectivejava;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Patrick on 25.02.2017.
 */
class CarTest {
    @Test
    @DisplayName("Equals Test")
    void equalsTest() {
        Car car = new Car("B-123",4, 4);
        Car clonedCar = new Car("B-123",4, 4);
        Car secondCar = new Car("B-12",4, 4);

        assertTrue(car.equals(car));
        assertTrue(car.equals(clonedCar));
        assertTrue(clonedCar.equals(car));

        assertFalse(car.equals(secondCar));
        assertFalse(secondCar.equals(car));

        assertFalse(car.equals(null));


    }

}