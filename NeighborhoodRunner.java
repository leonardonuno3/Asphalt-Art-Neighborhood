import org.code.neighborhood.*;

public class NeighborhoodRunner {
    public static void main(String[] args) {
        
        // paint the background
        BackgroundPainter leo = new BackgroundPainter();
        leo.setPaint(64);
        leo.paintBackground("Coral", 64);

        // Create HatPainter
        HatPainter lenny = new HatPainter();
        lenny.setPaint(16);
        lenny.paintHatBand("SaddleBrown", 8); 

   //creates the face 
      
        EyePainter hemmy = new EyePainter();
        hemmy.setPaint(12);
        hemmy.paintEyes("Snow");

        OtherEye le = new OtherEye();
        le.setPaint(12);
        le.paintEye("Snow");

        Nose koa = new Nose();
        koa.setPaint(12);
        koa.paintNose("Peru");

        Teeth mat = new Teeth();
        mat.setPaint(18);
        mat.paintTeeth("white");
    }
}
