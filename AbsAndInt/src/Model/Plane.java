package Model;

public class Plane implements Travel {
    private int expense = 1000;
    public Plane(){
    }
    public int ride(){
        return Money -expense;
    }

    public void Decision(){
        System.out.println("He can take plane! ");
    }
}
