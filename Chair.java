package composition;

public class Chair {
    private String colour;
    private Dimensions dimensions;

    public Chair(String colour, Dimensions dimensions) {
        this.colour = colour;
        this.dimensions = dimensions;
    }
    
    public void rock(){
        System.out.println(colour + " chair is rocking");
    }
    
    public String getColour(){
        return this.colour;
    }
    
    public Dimensions getDimensions(){
        return this.dimensions;
    }
}
