package Model;

public class Bus implements Travel {
    private int expense = 300;
    public Bus(){
    }
    public int ride(){
        return Money -expense;
    }

    public void Decision(){
        System.out.println("He can take bus! ");
    }
}
