public class Car {
    private String name;
    private String color;
    private int speed;
    private int fuelCapacity;

    Car(String name, String color,int speed,int fuelCapacity){
        this.name =name;
        this.color =color;
        this.speed=speed;
        this.fuelCapacity =fuelCapacity;
    }

    @Override
    public String toString(){
        return "Car: name: "+name+" color: "+color+" speed: "+speed+" fuel capacity: "+fuelCapacity;
    }
}
