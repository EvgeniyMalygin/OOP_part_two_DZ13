public class Truck extends Transport {
    public void checkTrailer() {

        System.out.println("Проверяем прицеп");
    }

    public Truck(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }
}
