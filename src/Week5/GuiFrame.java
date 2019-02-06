/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

/**
 * File: GuiFrame.java
 * Date: 4/6/2018
 * Author: Dillan Cobb
 * Purpose: Initial creating of the frame for the gui to be displayed on. 
 */

// Class imports
import javax.swing.*;

public class GuiFrame extends JFrame {
    // Static variables for the frame to use
    static final int WIDTH = 500, HEIGHT = 420;
    static final String FRAMETITLE = "Pizza Order Form";
    
    // Default constructor
    public GuiFrame () {
        super(FRAMETITLE);
        setFrame(WIDTH, HEIGHT);
    }
    
    // Additional constructor, allows custom size for the frame
    public GuiFrame(int width, int height) {
        super(FRAMETITLE);
        setFrame(width, height);
    }
    
    // display method shows the frame on the screen
    public void display() {
        setVisible(true);
    }
    
    // setFrame method allows easier editing of the size of the frame,
    // as well as sets the frame to the center of the screen
    public void setFrame(int width, int height) {
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
