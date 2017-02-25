package effectivejava;

/**
 * Created by Patrick on 25.02.2017.
 */
public class Truck {
    private final Car car;
    private final double maxWeight;

    public Truck(Car car, double maxWeight) {
        if (car == null)
            throw new IllegalArgumentException("Car cannot be null");
        this.car = car;
        this.maxWeight = maxWeight;
    }

    public Car asCar(){
        return car;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Truck))
            return false;

        Truck truck = (Truck) obj;

        return truck.car.equals(car)
                && truck.maxWeight == maxWeight;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + car.hashCode(); // Recursive hashCode for Objects
        long maxWeightAsLong  = Double.doubleToLongBits(maxWeight);
        result = 31 * result + (int) (maxWeightAsLong ^ (maxWeightAsLong >>> 32)); // bitshift for long

        return result;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "car=" + car +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
