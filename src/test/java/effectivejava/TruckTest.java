package effectivejava;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Patrick on 25.02.2017.
 */
class TruckTest {
    @Test
    @DisplayName("Equals Test")
    void equalsTest() {
        Car car = new Car("B-123",4, 4);
        Car car2 = new Car("B-1234",4, 4);
        Truck truck = new Truck(car, 1234.65);
        Truck truck2 = new Truck(car, 1234.65);
        Truck truck3 = new Truck(car2, 1234.65);

        assertTrue(truck.equals(truck));
        assertTrue(truck.equals(truck2));
        assertTrue(truck2.equals(truck));

        assertFalse(truck.equals(truck3));
        assertFalse(truck3.equals(truck));
        assertFalse(truck.equals(car));
        assertFalse(car.equals(truck));

        assertFalse(truck.equals(null));


    }

    @Test
    @DisplayName("Hash Code Test")
    void hashCodeTest() {
        Car car = new Car("B-123",4, 4);
        Car car2 = new Car("B-1234",4, 4);
        Truck truck = new Truck(car, 1234.65);
        Truck truck2 = new Truck(car, 1234.65);
        Truck truck3 = new Truck(car2, 1234.65);

        assertEquals(truck.hashCode(), truck2.hashCode());
        assertNotEquals(truck3.hashCode(), truck2.hashCode());
    }

}