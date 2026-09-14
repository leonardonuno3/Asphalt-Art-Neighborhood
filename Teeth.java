import org.code.neighborhood.*;
public class Teeth extends PainterPlus {
  
    public Teeth() {
      
    }

    public void paintTeeth(String color) {
        move();
      
        move();
        move();
        turnRight();
        move();
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
