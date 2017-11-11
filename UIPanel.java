
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.io.*;

public class UIPanel extends JPanel {

    // Nina implement this and think why pass g, x and y as parameters!
    void drawOneElementOfTheQueue(Graphics g, Integer data, int x, int y) {

    }

    UIPanel(){

    }

    /* Nina implement this and think what parameters should be passed in the construction function?
    UIPanel(???){

    }
    */

    // This function is only a simple example
    void drawOneElementOfTheQueue(Graphics g) {

        // draw a rect
        g.drawRect(50, 50, 50, 50);
        // draw the string
        g.drawString("1", 75, 75);


        // draw a rect
        g.drawRect(150, 50, 50, 50);
        // draw the string
        g.drawString("2", 175, 75);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        drawOneElementOfTheQueue(g);
        // use a for loop to invoke drawOneElementOfTheQueue(Graphics g, Integer data, int x, int y)
    }
}