package Model;

public class Car implements Travel{
    private int expense = 500;
    public Car(){
    }
    public int ride(){
        return Money -expense;
    }

    public void Decision(){
        System.out.println("He can drive! ");
    }
}
