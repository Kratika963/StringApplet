import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class StringApplet extends Applet implements ActionListener {
    private String text = "Hello, World!";
    private Color color = Color.BLACK;
    private int size = 12;

    private Button redButton;
    private Button blueButton;
    private Button greenButton;
    private Button largerButton;
    private Button smallerButton;

    public void init() {
        // Create buttons
        redButton = new Button("Red");
        blueButton = new Button("Blue");
        greenButton = new Button("Green");
        largerButton = new Button("+");
        smallerButton = new Button("-");

        // Add buttons to the applet
        add(redButton);
        add(blueButton);
        add(greenButton);
        add(largerButton);
        add(smallerButton);

        // Set up event listeners
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        greenButton.addActionListener(this);
        largerButton.addActionListener(this);
        smallerButton.addActionListener(this);
    }

    public void paint(Graphics g) {
        // Set the color and font of the string
        g.setColor(color);
        g.setFont(new Font("SansSerif", Font.PLAIN, size));

        // Draw the string
        g.drawString(text, 0, size);
    }

    public void actionPerformed(ActionEvent e) {
        // Determine which button was pressed
        if (e.getSource() == redButton) {
            color = Color.RED;
        } else if (e.getSource() == blueButton) {
            color = Color.BLUE;
        } else if (e.getSource() == greenButton) {
            color = Color.GREEN;
        } else if (e.getSource() == largerButton) {
            size++;
        } else if (e.getSource() == smallerButton) {
            size--;
        }

        // Repaint the applet to reflect the changes
        repaint();
    }
}