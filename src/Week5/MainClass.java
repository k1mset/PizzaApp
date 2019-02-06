/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

/**
 * File: MainClass.java
 * Date: 4/6/2018
 * Author: Dillan Cobb
 * Purpose: Creates the GuiFrame and displays it to the user.  
 */

public class MainClass extends GuiFrame {
    
    // Extends from the GuiFrame.java to make the gui frame
    MainClass() {
        super(500, 420);
        add(new GuiPanel());
    }
    
    // main class, creates the gui frame and displays it
    static public void main(String[] args) {
        MainClass pizzaApp = new MainClass();
        pizzaApp.display();
    }
}
