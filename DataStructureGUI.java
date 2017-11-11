import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.io.*;

public class DataStructureGUI extends JFrame {

    private final int CANVAS_INITIAL_WIDTH = 800;
    private final int CANVAS_INITIAL_HEIGHT = 640;

    private NinasQueue mData;
    private UIPanel dataPanel;


    private void LoadData() {

        mData = new NinasQueue();

        // Only a simple example, load from queue.txt and use String split function to split with '-' and get all the data
        // Remember to deal with exception, refer to 'try-catch'.
        mData.InQueue("10");
        mData.InQueue("20");
        mData.InQueue("30");

    }

    public DataStructureGUI() {

        // Load data
        //this.LoadData();

        // Display panel.
        dataPanel = new UIPanel();
        this.add(dataPanel);

        
        setTitle("DataStructureGUI");
        setSize(CANVAS_INITIAL_WIDTH, CANVAS_INITIAL_HEIGHT);

        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        DataStructureGUI dsWheelsInstance = new DataStructureGUI();
    }

}