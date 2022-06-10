import javax.swing.JFrame;
import java.awt.Dimension;

class VisWindow {
    private JFrame window;
    private String windowTitle = "Interface Visualizer";

    public VisWindow(){
        window = new JFrame(windowTitle);
        window.setMinimumSize(new Dimension(640, 320));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
    }
}