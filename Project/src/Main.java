public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder car1 = new CityCar();

        director.constructToyota(car1);
        Car toyota = car1.build();
        System.out.println(toyota);

        Car tesla = car1
                .setName("Tesla")
                .setColor("white")
                .setSpeed(100)
                .setFuelCapacity(80)
                .build();
        System.out.println(tesla);
    }
}