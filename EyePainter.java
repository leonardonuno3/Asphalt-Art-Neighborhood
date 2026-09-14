import org.code.neighborhood.*;

public class EyePainter extends PainterPlus {

    
    public EyePainter() {

    }


    public void paintEyes(String color) {
       turnRight();
     moveTwice();
    paint(color);
     move();
     paint(color);
  move();
     paint(color);
      turnLeft();
     paint(color);
  move();
           paint(color);
      turnLeft();
  move();

  paint("Black");
       move();
           paint(color);
          
    }
}
