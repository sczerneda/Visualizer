
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.text.Position;

import java.awt.*;
import java.awt.geom.Ellipse2D;

class MetaMethod extends JComponent {
    private String methodName;
    private ArrayList<Point> inputs;
    private ArrayList<Point> outputs;
    private Point position;
    private Dimension dim;
    private double pointDiameter;

    public MetaMethod(){
        dim = new Dimension(100, 150);
        position = new Point(200, 100);
        pointDiameter = 10;
        inputs = new ArrayList<>();
        outputs = new ArrayList<>();
        outputs.add(setOutputPoint());
    }

    /** Create and store a list of Point objects that represents where the
     *      inputs will be displayed. Input points are
     *      even distributed on the left side of the object. Since the 
     *      points will be displayed as {@link Ellipse2D.Double}, the point
     *      stored here is the center.
     */
    private void setInputPoints(){
        //TODO WIP method
        int numOfInputs = 2;
        
        for(int i=0;i<numOfInputs;i++){
            Point center = new Point(
                (int)position.getX(), 
                (int)(position.getY() + (i+1)*dim.getHeight()/(numOfInputs+1))
            );
        }
    }

    /** Create and store a Point object for where the output will be.
     *      The output point is in the center of the right side of the
     *      MetaMethod.
     */
    private Point setOutputPoint(){
        int divisor = 2;
        double x = position.getX() + dim.getWidth();
        double y = position.getY() + (dim.getHeight() / divisor);
        return new Point((int)x, (int)y);
    }

    /** Draw the MetaMethod object to the ... thing? Draw the things in the 
     *      place */
    @Override
    public void paintComponent(Graphics g){
        //Graphics2D is more useful/usable than Graphics:
        Graphics2D g2 = (Graphics2D) g;
        Rectangle testRect = new Rectangle(position, dim);

        // Ellipse2D.Double outputTestPoint = new Ellipse2D.Double(
        //     position.getX() + dim.getWidth() - (pointDiameter/2),
        //     position.getY() + dim.getHeight()/2 - (pointDiameter/2),
        //     pointDiameter, pointDiameter
        // );
        Ellipse2D.Double outputTestPoint = createInterfaceEllipse(outputs.get(0));

        g2.draw(testRect);
        g2.draw(outputTestPoint);
        
        Ellipse2D.Double[] inputTestPoints = new Ellipse2D.Double[2];
        for(int i=0;i<inputTestPoints.length;i++){
            Point center = new Point(
                (int)position.getX(), 
                (int)(position.getY() + (i+1)*dim.getHeight()/(inputTestPoints.length+1))
            );
            inputTestPoints[i] = createInterfaceEllipse(center);
            g2.draw(inputTestPoints[i]);
        }

    }
    private Point getCorner(Point center, double diameter){
        Point result = new Point(center);
        int translation = (int)(diameter / -2);
        result.translate(translation, translation);
        return result;
    }
    private Ellipse2D.Double createInterfaceEllipse(Point center){
        Ellipse2D.Double newEllipse = new Ellipse2D.Double();
        Point corner = getCorner(center, pointDiameter);
        newEllipse.setFrameFromCenter(center, corner);
        return newEllipse;
    }

}