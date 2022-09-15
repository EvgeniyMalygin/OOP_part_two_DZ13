public class ServiceStation implements ServiceStationAll {
    @Override
    public void check(Car[] car) {
        for (Car tempCar : car) {
            System.out.println("Обслуживаем " + tempCar.getModelName());
            for (int i = 0; i < tempCar.getWheelsCount(); i++) {
                tempCar.updateTyre();
            }
            tempCar.checkEngine();
        }
    }

    @Override
    public void check(Bicycle[] bicycle) {
        for (Bicycle tempBicyle : bicycle) {
            System.out.println("Обслуживаем " + tempBicyle.getModelName());
            for (int i = 0; i < tempBicyle.getWheelsCount(); i++) {
                tempBicyle.updateTyre();
            }
        }
    }

    @Override
    public void check(Truck[] truck) {
        for (Truck tempTruck : truck) {
            System.out.println("Обслуживаем " + tempTruck.getModelName());
            for (int i = 0; i < tempTruck.getWheelsCount(); i++) {
                tempTruck.updateTyre();
            }
            tempTruck.checkEngine();
            tempTruck.checkTrailer();
        }
    }
}
