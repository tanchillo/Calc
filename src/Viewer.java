import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Viewer extends JFrame {
    public static final int width = 1000;
    public static final int height = 1000;
    private Cube cube;
    public Container pane;
    public JPanel renderPanel;
    public JSlider vsliderVertical, vsliderHorizontal;
    private Color color;

    public Viewer(Cube cube) {
        this.cube = cube;
        pane = this.getContentPane();
        pane.setLayout(new BorderLayout());
        renderPanel = new JPanel(){
            @Override
            public void paintComponent(Graphics gr){
                Graphics2D g = (Graphics2D)gr;
                BasicStroke pen1 = new BasicStroke(3); //толщина линии 3
                g.setStroke(pen1);
                g.translate(Viewer.width/2, Viewer.height/2);
                g.setColor(Color.white);
                g.fillRect(-width/2,-height/2, width, height);
                g.setColor(Color.black);
                g.drawLine(-width/2,0, width/2, 0);
                g.drawLine(0,-height/2, 0, height/2);
                //cube.draw(g);
                cube.perspdraw(g, 500);
            }
        };
        this.setSize(width, height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Окно рисования");
        this.setLocationRelativeTo(null);
        this.setState(JFrame.ICONIFIED);
        pane.add(renderPanel, BorderLayout.CENTER);
        vsliderVertical = new JSlider(SwingConstants.VERTICAL,-90,90,0);
        pane.add(vsliderVertical, BorderLayout.EAST);
        vsliderHorizontal = new JSlider(SwingConstants.HORIZONTAL,-90,90,0);
        pane.add(vsliderHorizontal, BorderLayout.SOUTH);
        /*vslider.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e){
                int step = vslider.getValue();
                cube.rotate(step, 0, 0);
                repaint();
            }
        });
        */
    }

    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D)gr;
        BasicStroke pen1 = new BasicStroke(3); //толщина линии 3
        g.setStroke(pen1);
        g.translate(Viewer.width/2, Viewer.height/2);
        g.setColor(Color.white);

        g.fillRect(-width/2,-height/2, width, height);
        //cube.draw(g);
        cube.perspdraw(g, -6000);

    }

}