import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by tony_park on 3/16/17.
 */
public class Helicopter extends Sprite {
    private int dir;

    public Helicopter(int x, int y, int dir) {
        super(x, y, dir);
        setSpeed(5);
        setPic("Helicopter1.jpg", EAST);
    }




//    BufferedImage pic;
//    private int picOrientation;
//    public void setPic(String heli , int orientation) {
//        try {
//            pic = ImageIO.read(new File("res/" + "Helicopter1"));
//            picOrientation = orientation;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
