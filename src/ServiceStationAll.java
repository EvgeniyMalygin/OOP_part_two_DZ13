public interface ServiceStationAll {
    void check(Car[] car);

    void check(Bicycle[] bicycle);

    void check(Truck[] truck);

    public void updateTyre();

    public void checkEngine();
}
