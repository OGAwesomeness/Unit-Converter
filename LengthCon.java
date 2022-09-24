import javax.swing.*;

public class LengthCon {
    public static Float convert(String firstStr){
        Float val = 0f;
  
        // Convert the String
        try {
            val = Float.parseFloat(firstStr);
        }
        catch (NumberFormatException e) {
            //Do nothing
        }
        return val;
    }
    //Making the Window
    public LengthCon(JComboBox<String> LUnit1, JComboBox<String> LUnit2, JTextField LInput,JTextField LOutput) {
        String[] LUnits = {"Inches", "Feet", "Yards", "Miles", "Millimeters", 
            "Centimeters", "Meters", "Kilometers"};

        String firstStr = LInput.getText();
        Float val = convert(firstStr);
        String unitInput = (String)LUnit1.getSelectedItem();
        String unitOutput = (String)LUnit2.getSelectedItem();
        
         //Calculations
        if(unitInput.equals(LUnits[0]) && unitOutput.equals(LUnits[1])) {
            Float answer;
            answer = val / 12;
            String answerString = Float.toString(answer);
            LOutput.setText(answerString);
        } else if(unitInput.equals(LUnits[0]) && unitOutput.equals(LUnits[2])) {
            Float answer; 
            answer = val  / 36;
            String answerString = Float.toString(answer);
            LOutput.setText(answerString);
        } else if(unitInput.equals(LUnits[0]) && unitOutput.equals(LUnits[3])) {
            Float answer;
            answer = val / 63360;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[0]) && unitOutput.equals(LUnits[4])) {
            Float answer;
            answer = val * 25.4f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[0]) && unitOutput.equals(LUnits[5])) {
            Float answer;
            answer = val * 2.54f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[0]) && unitOutput.equals(LUnits[6])) {
            Float answer;
            answer = val / 39.3700787402f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[0]) && unitOutput.equals(LUnits[7])) {
            Float answer;
            answer = val / 39370.078740157f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[1]) && unitOutput.equals(LUnits[0])) {
            Float answer;
            answer = val * 12;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[1]) && unitOutput.equals(LUnits[2])) {
            Float answer;
            answer = val / 3;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[1]) && unitOutput.equals(LUnits[3])) {
            Float answer;
            answer = val / 5280;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[1]) && unitOutput.equals(LUnits[4])) {
            Float answer;
            answer = val * 304.8f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[1]) && unitOutput.equals(LUnits[5])) {
            Float answer;
            answer = val * 30.48f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[1]) && unitOutput.equals(LUnits[6])) {
            Float answer;
            answer = val / 3.280839895f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[1]) && unitOutput.equals(LUnits[7])) {
            Float answer;
            answer = val / 3280.8398950131f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[2]) && unitOutput.equals(LUnits[0])) {
            Float answer;
            answer = val * 36;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[2]) && unitOutput.equals(LUnits[1])) {
            Float answer;
            answer = val * 3;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[2]) && unitOutput.equals(LUnits[3])) {
            Float answer;
            answer = val / 1760;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[2]) && unitOutput.equals(LUnits[4])) {
            Float answer;
            answer = val * 914.4f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[2]) && unitOutput.equals(LUnits[5])) {
            Float answer;
            answer = val * 91.44f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[2]) && unitOutput.equals(LUnits[6])) {
            Float answer;
            answer = val / 1.0936132983f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[2]) && unitOutput.equals(LUnits[7])) {
            Float answer;
            answer = val / 1093.6132983377f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[3]) && unitOutput.equals(LUnits[0])) {
            Float answer;
            answer = val * 63360;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[3]) && unitOutput.equals(LUnits[1])) {
            Float answer;
            answer = val * 5280;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[3]) && unitOutput.equals(LUnits[2])) {
            Float answer;
            answer = val * 1760;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[3]) && unitOutput.equals(LUnits[4])) {
            Float answer;
            answer = val * 1609344;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[3]) && unitOutput.equals(LUnits[5])) {
            Float answer;
            answer = val * 160934.4f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[3]) && unitOutput.equals(LUnits[6])) {
            Float answer;
            answer = val * 1609.344f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[3]) && unitOutput.equals(LUnits[7])) {
            Float answer;
            answer = val * 1.609344f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[4]) && unitOutput.equals(LUnits[0])) {
            Float answer;
            answer = val / 25.4f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[4]) && unitOutput.equals(LUnits[1])) {
            Float answer;
            answer = val / 304.8f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[4]) && unitOutput.equals(LUnits[2])) {
            Float answer;
            answer = val / 914.4f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[4]) && unitOutput.equals(LUnits[3])) {
            Float answer;
            answer = val / 1609344f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[4]) && unitOutput.equals(LUnits[5])) {
            Float answer;
            answer = val / 10;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[4]) && unitOutput.equals(LUnits[6])) {
            Float answer;
            answer = val / 1000;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[4]) && unitOutput.equals(LUnits[7])) {
            Float answer;
            answer = val / 1000000;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[5]) && unitOutput.equals(LUnits[0])) {
            Float answer;
            answer = val / 2.54f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[5]) && unitOutput.equals(LUnits[1])) {
            Float answer;
            answer = val / 30.48f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[5]) && unitOutput.equals(LUnits[2])) {
            Float answer;
            answer = val / 91.44f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[5]) && unitOutput.equals(LUnits[3])) {
            Float answer;
            answer = val / 160934.4f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[5]) && unitOutput.equals(LUnits[4])) {
            Float answer;
            answer = val * 10;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[5]) && unitOutput.equals(LUnits[6])) {
            Float answer;
            answer = val / 10;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[5]) && unitOutput.equals(LUnits[7])) {
            Float answer;
            answer = val / 100000;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[6]) && unitOutput.equals(LUnits[0])) {
            Float answer;
            answer = val * 39.3700787402f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[6]) && unitOutput.equals(LUnits[1])) {
            Float answer;
            answer = val * 3.280839895f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[6]) && unitOutput.equals(LUnits[2])) {
            Float answer;
            answer = val * 1.0936132983f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[6]) && unitOutput.equals(LUnits[3])) {
            Float answer;
            answer = val / 1609.344f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[6]) && unitOutput.equals(LUnits[4])) {
            Float answer;
            answer = val * 1000;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[6]) && unitOutput.equals(LUnits[5])) {
            Float answer;
            answer = val * 100;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[6]) && unitOutput.equals(LUnits[7])) {
            Float answer;
            answer = val / 1000;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[7]) && unitOutput.equals(LUnits[0])) {
            Float answer;
            answer = val * 39370.078740157f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[7]) && unitOutput.equals(LUnits[1])) {
            Float answer;
            answer = val * 3280.8398950131f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[7]) && unitOutput.equals(LUnits[2])) {
            Float answer;
            answer = val * 1093.6132983377f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[7]) && unitOutput.equals(LUnits[3])) {
            Float answer;
            answer = val / 1.609344f;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[7]) && unitOutput.equals(LUnits[4])) {
            Float answer;
            answer = val * 1000000;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[7]) && unitOutput.equals(LUnits[5])) {
            Float answer;
            answer = val * 100000;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        } else if(unitInput.equals(LUnits[7]) && unitOutput.equals(LUnits[6])) {
            Float answer;
            answer = val * 1000;
            String answeString = Float.toString(answer);
            LOutput.setText(answeString);
        }
         else if(unitInput.equals(unitOutput)) {
            LOutput.setText(LInput.getText());
        }
    }
}