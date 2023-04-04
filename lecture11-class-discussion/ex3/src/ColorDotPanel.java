import javax.swing.*;
import java.awt.*;


/**
 * An exercise to create an animation, which will randomly change the color of the dot every 500ms by click on the start button.
 */

public class ColorDotPanel extends JPanel {
    private JButton startButton;
    private final int X = 50, Y = 50, DOT_WIDTH = 200, DOT_HEIGHT = 200;
    private Color color;

    /*TODO: Create the animation to randomly change the dot color every 500ms when the start button is clicked.
     * The start button will become the stop button when the animation is on.
     * The stop button should stop the animation when it's been clicked and the dot color remains at the last appearance.
     */

    public ColorDotPanel(){
        generateRandomColor();
        startButton = new JButton("Start the timer!");
        this.add(startButton);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(X, Y, DOT_WIDTH, DOT_HEIGHT);
    }

    private void generateRandomColor() {
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);
        this.color = new Color(r,g,b);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setLocation(100,100);
                frame.setTitle("Coloring the dot!");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                ColorDotPanel panel = new ColorDotPanel();
                panel.setPreferredSize(new Dimension(300,300));
                panel.requestFocusInWindow();
                frame.getContentPane().add(panel);
                frame.pack();
                frame.setVisible(true);

            }
        });
    }
}
