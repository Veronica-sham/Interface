package Model;

public class Test {
    public static void main(String args[]) {
        Travel plane = new Plane();
        Travel car = new Car();
        Travel train = new Train();
        Travel bus = new Bus();

        if (plane.ride()>=0){
            plane.Decision();
        }
        if (car.ride()>=0){
            car.Decision();
        }
        if (train.ride()>=0){
            train.Decision();
        }
        if (bus.ride()>=0){
            bus.Decision();
        }


    }

}
