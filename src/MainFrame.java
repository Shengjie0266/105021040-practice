import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JLabel lab = new JLabel("123");
    private Container cp;
    private int W = 50, H = 50;

    public MainFrame() {
        init();
    }

    private void init() {
        this.setBounds(50, 50, 300, 400);
        lab.setBounds(this.getWidth()/ 2 - W / 2, this.getHeight() / 2 - H / 2, 50, 50);
        cp = this.getContentPane();
        cp.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        lab.setOpaque(true);
        lab.setHorizontalAlignment(SwingConstants.CENTER);
        lab.setBackground(Color.yellow);
        cp.add(lab);
    }
}
