import org.code.neighborhood.*;
public class Nose extends PainterPlus {
  
    public Nose() {
      
    }

    public void paintNose(String color) {
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        move();
        move();
        
        paint(color); 
      turnLeft();
      move();
              paint(color); 

    }
}
