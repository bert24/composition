package composition;

public class Walls {
    private String colour;
    private int height;

    public Walls(String colour, int height) {
        this.colour = colour;
        this.height = height;
    }
    
    public void fallOff(){
        System.out.println(this.colour + " paint is falling off from "+ this.height + " centimiters ");
    }
}
