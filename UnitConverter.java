//package Projects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UnitConverter extends JFrame {
    public static void main(String[] args) {
        //Application Frame
        JFrame unitCon = new JFrame("Unit Converter");
        unitCon.setSize(250, 350);
        unitCon.setLayout(null);
        unitCon.setVisible(true);

        //Setting Up Buttons
        JButton Length = new JButton("Length");
        Length.setBounds(70, 25, 90, 50);
        unitCon.add(Length);

        JButton Mass = new JButton("Mass");
        Mass.setBounds(70, 100, 90, 50);
        unitCon.add(Mass);
        
        JButton Volume = new JButton("Volume");
        Volume.setBounds(70, 175, 90, 50);
        unitCon.add(Volume);

        //Displaying Application Windows
        //Length
        Length.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent a) {
                if(a.getSource() == Length) {
                    //Length Converter Window
                    JFrame LengthCon = new JFrame("Length Converter");
                    LengthCon.setSize(250, 350);
                    LengthCon.setLayout(null);
                    LengthCon.setVisible(true);

                    //Units
                    String[] LUnits = {"Inches", "Feet", "Yards", "Miles", "Millimeters", 
                        "Centimeters", "Meters", "Kilometers"};

                    //Button
                    JButton calculate = new JButton("Calculate");
                    calculate.setBounds(75, 175, 93, 40);
                    LengthCon.add(calculate);
                    calculate.setVisible(true);
                    
                    //Combo Boxes
                    JComboBox<String> LUnit1 = new JComboBox<>(LUnits);
                    LUnit1.setBounds(18, 50, 90, 20);
                    LengthCon.add(LUnit1);
                    LUnit1.setVisible(true);
                    JComboBox<String> LUnit2 = new JComboBox<>(LUnits);
                    LUnit2.setBounds(125, 50, 90, 20);
                    LengthCon.add(LUnit2);
                    LUnit2.setVisible(true);

                    //Text Fields
                    JTextField LInput = new JTextField("");
                    LInput.setBounds(18, 90, 90, 20);
                    LengthCon.add(LInput);
                    LInput.setVisible(true);
                    JTextField LOut = new JTextField("");
                    LOut.setBounds(125, 90, 90, 20);
                    LengthCon.add(LOut);
                    LOut.setVisible(true);

                    //Confirming User Input
                    calculate.addActionListener(new ActionListener() {
                        public void actionPerformed (ActionEvent a) {
                            if(a.getSource() == calculate){
                                //Calculations
                                String LOutput = LOut.getText();
                                LengthCon LCon = new LengthCon(LUnit1, LUnit2, LInput, LOut);
                            }
                        }
                    });

                }
            }
        });

        //Mass
        Mass.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent a) {
                if(a.getSource() == Mass) {
                    //Window
                    JFrame MPage = new JFrame("Mass Converter");
                    MPage.setSize(250,350);
                    MPage.setLayout(null);
                    MPage.setVisible(true);

                    //Units
                    String[] mUnits = {"Ounces", "Pounds", "US Tons", "Grams", "Kilograms"};

                    //Button
                    JButton calculate = new JButton("Calculate");
                    calculate.setBounds(75, 175, 93, 40);
                    MPage.add(calculate);
                    calculate.setVisible(true);
                    
                    //Combo Boxes
                    JComboBox<String> MUnit1 = new JComboBox<>(mUnits);
                    MUnit1.setBounds(18, 50, 90, 20);
                    MPage.add(MUnit1);
                    MUnit1.setVisible(true);
                    JComboBox<String> MUnit2 = new JComboBox<>(mUnits);
                    MUnit2.setBounds(125, 50, 90, 20);
                    MPage.add(MUnit2);
                    MUnit2.setVisible(true);

                    //Text Fields
                    JTextField MInput = new JTextField("");
                    MInput.setBounds(18, 90, 90, 20);
                    MPage.add(MInput);
                    MInput.setVisible(true);
                    JTextField MOut = new JTextField("");
                    MOut.setBounds(125, 90, 90, 20);
                    MPage.add(MOut);
                    MOut.setVisible(true);

                    //Confirming User Input
                    calculate.addActionListener(new ActionListener() {
                        public void actionPerformed (ActionEvent a) {
                            if(a.getSource() == calculate) {
                                String MOutput = MOut.getText();
                                MassCon mCon = new MassCon(MUnit1, MUnit2, MInput, MOut);
                            }
                        }
                    });
                }
            }
        });

        //Volume
        Volume.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent a) {
                if(a.getSource() == Volume) {
                    JFrame VPage = new JFrame("Volume Converter");
                    VPage.setSize(250,350);
                    VPage.setLayout(null);
                    VPage.setVisible(true);

                    //Units
                    String[] vUnits = {"Ounces", "Cup", "Quart", "Pint", "Gallon", "Milliliter",
                        "Liter", };
                    
                    //Button
                    JButton calculate = new JButton("Calculate");
                    calculate.setBounds(75, 175, 93, 40);
                    VPage.add(calculate);
                    calculate.setVisible(true);
                    
                    //Combo Boxes
                    JComboBox<String> VUnit1 = new JComboBox<>(vUnits);
                    VUnit1.setBounds(18, 50, 90, 20);
                    VPage.add(VUnit1);
                    VUnit1.setVisible(true);
                    JComboBox<String> VUnit2 = new JComboBox<>(vUnits);
                    VUnit2.setBounds(125, 50, 90, 20);
                    VPage.add(VUnit2);
                    VUnit2.setVisible(true);

                    //Text Fields
                    JTextField VInput = new JTextField("");
                    VInput.setBounds(18, 90, 90, 20);
                    VPage.add(VInput);
                    VInput.setVisible(true);
                    JTextField VOut = new JTextField("");
                    VOut.setBounds(125, 90, 90, 20);
                    VPage.add(VOut);
                    VOut.setVisible(true);

                    //Confirming User Input
                    calculate.addActionListener(new ActionListener(){
                        public void actionPerformed (ActionEvent a) {
                            if(a.getSource() == calculate) {
                                //Calculations
                                String VOutput = VOut.getText();
                                VolumeCon vCon = new VolumeCon(VUnit1, VUnit2, VInput, VOut);
                                
                            }
                        }
                    });
                }
            }
        });

    }
    public static double convert(String firstStr){
        double val = 0;
  
        // Convert the String
        try {
            val = Double.parseDouble(firstStr);
        }
        catch (NumberFormatException e) {
            //Do nothing
        }
        return val;
    }
}