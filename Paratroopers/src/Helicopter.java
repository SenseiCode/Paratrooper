import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by tony_park on 3/16/17.
 */
public class Helicopter {
    BufferedImage pic;
    private int picOrientation;
    public void setPic(String heli , int orientation) {
        try {
            pic = ImageIO.read(new File("res/" + "Helicopter1"));
            picOrientation = orientation;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
