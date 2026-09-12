public interface Builder{
    Builder setName(String name);
    Builder setColor(String color);
    Builder setSpeed(int speed);
    Builder setFuelCapacity(int fuelCapacity);
    Car build();
}