package composition;

public class Room {
    private Walls walls;
    private Chair chair;
    
    Room(Walls walls, Chair chair){
        this.walls=walls;
        this.chair=chair;
    }
    
    public void whatIs(){
        System.out.println("in the room is " + chair.getColour() + " " + 
                chair.getDimensions().getX() + "x" + chair.getDimensions().getY() + "x" + 
                chair.getDimensions().getZ() + " chair");
    }
    
    public Walls getWalls(){
        return this.walls;
    }
    
    public Chair getChair(){
        return this.chair;
    }
}
