import javax.swing.*;
import java.awt.*;

/**
 * Created by jackson_fletcher on 3/16/17.
 */
public class Panel extends JPanel {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
    Missle missle= new Missle(200,200);
        missle.drawMissle(g2);
    }
}
