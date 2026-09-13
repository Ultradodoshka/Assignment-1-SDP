public class CityCar implements Builder {
    private String name;
    private int speed;
    private int fuelCapacity;
    private String color;

    @Override
    public Builder setName(String name) {
        this.name =name;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color=color;
        return this;
    }

    @Override
    public Builder setSpeed(int speed) {
        this.speed=speed;
        return this;
    }

    @Override
    public Builder setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity=fuelCapacity;
        return this;
    }

    @Override
    public Car build() {
        if(this.name == null || this.name.isEmpty()){
            throw new IllegalStateException("Car must have name");
        }
        if(this.speed > 150){
            throw new IllegalStateException("Car must be slower than 150");
        }
        return new Car(name,color,speed,fuelCapacity);
    }
}
