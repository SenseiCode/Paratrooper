import javax.swing.*;

/**
 * Created by jackson_fletcher on 3/13/17.
 */
public class Main extends JPanel{
    public static final int FRAMEWIDTH = 800, FRAMEHEIGHT = 600;



    public static void main(String[] args) {
        JFrame window = new JFrame("Paratrooper!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, FRAMEWIDTH, FRAMEHEIGHT + 22); //(x, y, w, h) 22 due to title bar.

        Main panel = new Main();
        panel.setSize(FRAMEWIDTH, FRAMEHEIGHT);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);
        window.setVisible(true);
        window.setResizable(false);
    }
}