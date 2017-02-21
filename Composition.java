package composition;

public class Composition {

    public static void main(String[] args) {
        Walls walls = new Walls("white", 250);
        Chair chair = new Chair("brown", new Dimensions(50, 60, 100));
        
        Room room = new Room(walls, chair);
        
        room.whatIs();
        
        room.getWalls().fallOff();
        
        room.getChair().rock();
    }
    
}
