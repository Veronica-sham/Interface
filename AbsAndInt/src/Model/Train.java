package Model;

public class Train implements Travel {
    private int expense = 400;
    public Train(){
    }
    public int ride(){
        return Money -expense;
    }

    public void Decision(){
        System.out.println("He can take train! ");
    }
}
