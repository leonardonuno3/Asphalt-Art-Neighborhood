import org.code.neighborhood.*;

public class HatPainter extends PainterPlus {


    public void HatPainter() {
      
    }

    public void paintHat(String color) {
        paintRow(color);
    turnRight();
  
      move();
          turnRight();

      paintRow(color);
     
    }
}
