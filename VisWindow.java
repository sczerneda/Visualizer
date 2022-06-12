import javax.swing.*;
import java.awt.*;

class VisWindow {
    private JFrame window;
    private String windowTitle = "Interface Visualizer";

    public VisWindow(){
        window = new JFrame(windowTitle);
        window.setMinimumSize(new Dimension(640, 640));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        
        MetaMethod test = new MetaMethod();
        window.add(test);

        window.setVisible(true);
    }
    
    /** Draws a start grid as the background. The grid serves as a visual 
     *      guide to the possible positions of the elements added to it */
    public void drawBackgroundGrid(){}

}