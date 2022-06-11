
import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;

class MetaMethod extends JComponent {
    private String methodName;
    private ArrayList<Point> inputs;
    private ArrayList<Point> outputs;

    public MetaMethod(){}

    @Override
    public void paintComponent(Graphics g){
        //Graphics2D is more useful/usable than Graphics:
        Graphics2D g2 = (Graphics2D) g;
        Rectangle rect = new Rectangle(50, 60, 25, 25);
        g2.draw(rect);
    }

}