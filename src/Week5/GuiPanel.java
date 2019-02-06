/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

/**
 * File: GuiPanel.java
 * Date: 4/6/2018
 * Author: Dillan Cobb
 * Purpose: Creates the actual Gui, and contains its functionality.  
 */

// Class imports
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import java.text.DecimalFormat;

public class GuiPanel extends JPanel {
    
    // Creates DecimalFormat for currency
    private DecimalFormat format = new DecimalFormat("#.00");
    
    // Creates all the labels for the gui
    private JLabel welcomeLbl = new JLabel("Welcome to Pizza Shack", 
            JLabel.CENTER);
    private JLabel orderLbl = new JLabel("Please order your food below, and "
            + "hit 'SUBMIT' when you are finished.", JLabel.CENTER);
    private JLabel smallLbl = new JLabel("Small 8\"");
    private JLabel mediumLbl = new JLabel("Medium 12\"");
    private JLabel largeLbl = new JLabel("Large 16\"");
    
    // Creates all the titled borders for the gui
    private TitledBorder pizzaSizeBorder = new TitledBorder("Pizza Size");
    private TitledBorder pizzaTopBorder = new TitledBorder("Pizza Toppings $.50");
    
    // Creates all the radio buttons for the gui
    private JRadioButton smallRadioBtn = new JRadioButton("$6", true);
    private JRadioButton mediumRadioBtn = new JRadioButton("$10");
    private JRadioButton largeRadioBtn = new JRadioButton("$14");
    
    // Creates all the check boxes for the gui
    private JCheckBox pepperoniChkBox = new JCheckBox("Pepperoni");
    private JCheckBox hamChkBox = new JCheckBox("Ham");
    private JCheckBox sausageChkBox = new JCheckBox("Sausage");
    private JCheckBox greenPepperChkBox = new JCheckBox("Green Pepper");
    private JCheckBox blackOliveChkBox = new JCheckBox("Black Olive");
    private JCheckBox jalapenosChkBox = new JCheckBox("Jalapenos");
    private JCheckBox pineappleChkBox = new JCheckBox("Pineapple");
    private JCheckBox beefChkBox = new JCheckBox("Beef");
    private JCheckBox baconChkBox = new JCheckBox("Bacon");
    private JCheckBox mushroomChkBox = new JCheckBox("Mushroom");
    private JCheckBox onionsChkBox = new JCheckBox("Onions");
    private JCheckBox extraCheeseChkBox = new JCheckBox("Extra Cheese");
    private JCheckBox extraSauceChkBox = new JCheckBox("Extra Sauce");
    private JCheckBox cheeseCrustChkBox = new JCheckBox("Cheese Crust");
    private JCheckBox butterCrustChkBox = new JCheckBox("Butter Crust");
    
    // Creates the button for the gui
    private JButton submitBtn = new JButton("Submit");
    
    // Creates the option pane for the gui
    private JOptionPane msgPane = new JOptionPane();
    
    public GuiPanel() {
        
        // Creates all the panels to be used in the frame
        JPanel mainPanel = new JPanel();
        JPanel introPanel = new JPanel();
        JPanel sizePanel = new JPanel();
        JPanel toppingPanel = new JPanel();
        JPanel submitPanel = new JPanel();
        
        // Set up for each panel and adding all the items into them
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        introPanel.setLayout(new GridLayout(2, 1));
        introPanel.setBorder(BorderFactory.createEmptyBorder(0, 30, 30, 30));
        introPanel.add(welcomeLbl);
        introPanel.add(orderLbl);
        
        sizePanel.setLayout(new GridLayout(2, 3, 5, 5));
        sizePanel.setBorder(pizzaSizeBorder);
        sizePanel.add(smallLbl);
        sizePanel.add(mediumLbl);
        sizePanel.add(largeLbl);
        sizePanel.add(smallRadioBtn);
        sizePanel.add(mediumRadioBtn);
        sizePanel.add(largeRadioBtn);
        
        toppingPanel.setLayout(new GridLayout(5, 3, 5, 5));
        toppingPanel.setBorder(pizzaTopBorder);
        toppingPanel.add(pepperoniChkBox);
        toppingPanel.add(hamChkBox);
        toppingPanel.add(sausageChkBox);
        toppingPanel.add(greenPepperChkBox);
        toppingPanel.add(blackOliveChkBox);
        toppingPanel.add(jalapenosChkBox);
        toppingPanel.add(pineappleChkBox);
        toppingPanel.add(beefChkBox);
        toppingPanel.add(baconChkBox);
        toppingPanel.add(mushroomChkBox);
        toppingPanel.add(onionsChkBox);
        toppingPanel.add(extraCheeseChkBox);
        toppingPanel.add(extraSauceChkBox);
        toppingPanel.add(cheeseCrustChkBox);
        toppingPanel.add(butterCrustChkBox);
        
        submitPanel.setLayout(new FlowLayout());
        submitPanel.add(submitBtn);
        
        // Adds the panels to the frame
        mainPanel.add(introPanel);
        mainPanel.add(sizePanel);
        mainPanel.add(toppingPanel);
        mainPanel.add(submitPanel);
        add(mainPanel);
        
        // Groups the radio buttons
        ButtonGroup sizeButtonGroup = new ButtonGroup();
        sizeButtonGroup.add(smallRadioBtn);
        sizeButtonGroup.add(mediumRadioBtn);
        sizeButtonGroup.add(largeRadioBtn);
        
        // ActionListener for the submit button
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double totalPrice = getPizzaCost();
                String pizzaSize = getPizzaSize();
                String pizzaToppings = getPizzaToppings();
                
                // Displays the option pane to the user confirming their order
                msgPane.showMessageDialog(null, "Your order of a " + pizzaSize 
                        + " pizza with" + pizzaToppings + " was confirmed." 
                        + " Your total comes out to $" 
                        + format.format(totalPrice) + ". Thank you for buying "
                        + "from Pizza Shack. Please order again!");
            }
        });
    }
    
    // getPizzaToppings method collects all the checked pizza topping boxes and
    // returns them in a large string
    public String getPizzaToppings() {
        String pizzaTopping = "";
        
        if (pepperoniChkBox.isSelected())
            pizzaTopping += " pepperoni";
        if (hamChkBox.isSelected())
            pizzaTopping += " ham";
        if (sausageChkBox.isSelected())
            pizzaTopping += " sausage";
        if (greenPepperChkBox.isSelected())
            pizzaTopping += " green pepper";
        if (blackOliveChkBox.isSelected())
            pizzaTopping += " black olive";
        if (jalapenosChkBox.isSelected())
            pizzaTopping += " jalapenos";
        if (pineappleChkBox.isSelected())
            pizzaTopping += " pineapple";
        if (beefChkBox.isSelected())
            pizzaTopping += " beef";
        if (baconChkBox.isSelected())
            pizzaTopping += " bacon";
        if (mushroomChkBox.isSelected())
            pizzaTopping += " mushroom";
        if (onionsChkBox.isSelected())
            pizzaTopping += " onions";
        if (extraCheeseChkBox.isSelected())
            pizzaTopping += " extra cheese";
        if (extraSauceChkBox.isSelected())
            pizzaTopping += " extra sauce";
        if (cheeseCrustChkBox.isSelected())
            pizzaTopping += " cheese crust";
        if (butterCrustChkBox.isSelected())
            pizzaTopping += " butter crust";
        
        return pizzaTopping;
    }
    
    // getPizzaCost method collects all the radio buttons and check boxes 
    // and adds their prices all up. Returns the total price of the order
    public double getPizzaCost() {
        double pizzaCost = 0.00;
        
        if (smallRadioBtn.isSelected())
            pizzaCost += 6;
        if (mediumRadioBtn.isSelected())
            pizzaCost += 10;
        if (largeRadioBtn.isSelected())
            pizzaCost += 14;
        if (pepperoniChkBox.isSelected())
            pizzaCost += .5;
        if (pepperoniChkBox.isSelected())
            pizzaCost += .5;
        if (hamChkBox.isSelected())
            pizzaCost += .5;
        if (sausageChkBox.isSelected())
            pizzaCost += .5;
        if (greenPepperChkBox.isSelected())
            pizzaCost += .5;
        if (blackOliveChkBox.isSelected())
            pizzaCost += .5;
        if (jalapenosChkBox.isSelected())
            pizzaCost += .5;
        if (pineappleChkBox.isSelected())
            pizzaCost += .5;
        if (beefChkBox.isSelected())
            pizzaCost += .5;
        if (baconChkBox.isSelected())
            pizzaCost += .5;
        if (mushroomChkBox.isSelected())
            pizzaCost += .5;
        if (onionsChkBox.isSelected())
            pizzaCost += .5;
        if (extraCheeseChkBox.isSelected())
            pizzaCost += .5;
        if (extraSauceChkBox.isSelected())
            pizzaCost += .5;
        if (cheeseCrustChkBox.isSelected())
            pizzaCost += .5;
        if (butterCrustChkBox.isSelected())
            pizzaCost += .5;
        
        return pizzaCost;
    }
    
    // getPizzaSize method, returns a String for the size of the pizza according
    // to the radio button selected
    public String getPizzaSize() {
        String pizzaSize;
        
        if (smallRadioBtn.isSelected())
            pizzaSize = "small";
        else if (mediumRadioBtn.isSelected())
            pizzaSize = "medium";
        else
            pizzaSize = "large";
        
        return pizzaSize;
    }
}
