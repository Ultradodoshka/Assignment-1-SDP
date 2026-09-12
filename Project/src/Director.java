public class Director {
    public void constructFerrari(Builder builder){
        builder.setName("Ferrari")
                .setColor("red")
                .setSpeed(300)
                .setFuelCapacity(100);
    }

    public void constructToyota(Builder builder){
        builder.setName("Toyota")
                .setColor("White")
                .setSpeed(80)
                .setFuelCapacity(60);
    }

}
