package com.lexxkit;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation[] vehiclesAtService = {
                car, car2,
                truck, truck2,
                bicycle, bicycle2
        };

        for (int i = 0; i < vehiclesAtService.length; i++) {
            vehiclesAtService[i].check();
        }

//        ServiceStation station = new ServiceStationImpl();
//        station.check(car, null, null);
//        station.check(car2, null, null);
//        station.check(null, bicycle, null);
//        station.check(null, bicycle2, null);
//        station.check(null, null, truck);
//        station.check(null, null, truck2);
    }
}
