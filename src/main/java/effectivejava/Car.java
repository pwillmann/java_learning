package effectivejava;

/**
 * Created by Patrick on 25.02.2017.
 */
public class Car {
    private final String licensePlate;
    private final int seats;
    private final int tires;
    private boolean isRegistered;
    private long currentMileage;

    public Car(String licensePlate, int seats, int tires) {
        this.licensePlate = licensePlate;
        this.seats = seats;
        this.tires = tires;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public long getCurrentMileage() {
        return currentMileage;
    }

    public void increaseMileageBy(long drivenKilometers){
        this.currentMileage = this.currentMileage + drivenKilometers;
    }

    /**
     * Should take into account all important fields
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Car))
            return false;

        Car car = (Car) obj;

        return car.licensePlate.equals(licensePlate)
                && car.seats == seats
                && car.tires == tires
                && car.isRegistered == isRegistered
                && car.currentMileage == currentMileage;
    }

    /**
     * Should be overriden together with equals
     *
     * Use the same fields as in equals!
     * @return
     */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + licensePlate.hashCode(); // Recursive hashCode for Objects
        result = 31 * result + seats; // take int value for (int, char ,byte, short)
        result = 31 * result + tires;
        result = 31 * result + (isRegistered ? 1: 0); // 1, 0 for boolean
        result = 31 * result + (int) (currentMileage ^ (currentMileage >>> 32)); // bitshift for long

        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", seats=" + seats +
                ", tires=" + tires +
                ", isRegistered=" + isRegistered +
                ", currentMileage=" + currentMileage +
                '}';
    }


}
