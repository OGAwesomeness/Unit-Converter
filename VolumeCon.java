import javax.swing.JComboBox;
import javax.swing.JTextField;

public class VolumeCon {
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
    public VolumeCon(JComboBox<String> VUnit1, JComboBox<String> VUnit2, JTextField VInput,JTextField VOutput) {
        //Units
        String[] vUnits = {"Ounces", "Cup", "Quart", "Pint", "Gallon", "Milliliter",
            "Liter", };

        //Conversions
        String firstStr = VInput.getText();
        Float val = convert(firstStr);
        String unitInput = (String)VUnit1.getSelectedItem();
        String unitOutput = (String)VUnit2.getSelectedItem();

        //Calculations
        if(unitInput.equals(vUnits[0]) && unitOutput.equals(vUnits[1])) {
            Float answer;
            answer = val / 8;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[0]) && unitOutput.equals(vUnits[2])) {
            Float answer;
            answer = val / 32;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[0]) && unitOutput.equals(vUnits[3])) {
            Float answer;
            answer = val / 16;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[0]) && unitOutput.equals(vUnits[4])) {
            Float answer;
            answer = val / 128;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[0]) && unitOutput.equals(vUnits[5])) {
            Float answer;
            answer = val * 29.5735295f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[0]) && unitOutput.equals(vUnits[6])) {
            Float answer;
            answer = val / 33.8140227f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[1]) && unitOutput.equals(vUnits[0])) {
            Float answer;
            answer = val * 8;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[1]) && unitOutput.equals(vUnits[2])) {
            Float answer;
            answer = val / 4;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[1]) && unitOutput.equals(vUnits[3])) {
            Float answer;
            answer = val / 2;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[1]) && unitOutput.equals(vUnits[4])) {
            Float answer;
            answer = val / 16;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[1]) && unitOutput.equals(vUnits[5])) {
            Float answer;
            answer = val * 236.588236f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[1]) && unitOutput.equals(vUnits[6])) {
            Float answer;
            answer = val / 4.2267528f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[2]) && unitOutput.equals(vUnits[0])) {
            Float answer;
            answer = val * 32;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[2]) && unitOutput.equals(vUnits[1])) {
            Float answer;
            answer = val * 4;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[2]) && unitOutput.equals(vUnits[3])) {
            Float answer;
            answer = val * 2;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[2]) && unitOutput.equals(vUnits[4])) {
            Float answer;
            answer = val / 4;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[2]) && unitOutput.equals(vUnits[5])) {
            Float answer;
            answer = val * 946.352945f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[2]) && unitOutput.equals(vUnits[6])) {
            Float answer;
            answer = val / 1.05668821f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[3]) && unitOutput.equals(vUnits[0])) {
            Float answer;
            answer = val * 16;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[3]) && unitOutput.equals(vUnits[1])) {
            Float answer;
            answer = val * 2;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[3]) && unitOutput.equals(vUnits[2])) {
            Float answer;
            answer = val / 2;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[3]) && unitOutput.equals(vUnits[4])) {
            Float answer;
            answer = val / 8;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[3]) && unitOutput.equals(vUnits[5])) {
            Float answer;
            answer = val * 473.176472f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[3]) && unitOutput.equals(vUnits[6])) {
            Float answer;
            answer = val / 2.11337642f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[4]) && unitOutput.equals(vUnits[0])) {
            Float answer;
            answer = val * 128;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[4]) && unitOutput.equals(vUnits[1])) {
            Float answer;
            answer = val * 16;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[4]) && unitOutput.equals(vUnits[2])) {
            Float answer;
            answer = val * 4;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[4]) && unitOutput.equals(vUnits[3])) {
            Float answer;
            answer = val * 8;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[4]) && unitOutput.equals(vUnits[5])) {
            Float answer;
            answer = val * 3785.41178f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[4]) && unitOutput.equals(vUnits[6])) {
            Float answer;
            answer = val * 3.78541178f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[5]) && unitOutput.equals(vUnits[0])) {
            Float answer;
            answer = val / 29.5735295f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[5]) && unitOutput.equals(vUnits[1])) {
            Float answer;
            answer = val / 236.588263f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[5]) && unitOutput.equals(vUnits[2])) {
            Float answer;
            answer = val / 946.352945f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[5]) && unitOutput.equals(vUnits[3])) {
            Float answer;
            answer = val / 473.176472f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[5]) && unitOutput.equals(vUnits[4])) {
            Float answer;
            answer = val / 3785.41178f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[5]) && unitOutput.equals(vUnits[6])) {
            Float answer;
            answer = val / 1000;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[6]) && unitOutput.equals(vUnits[0])) {
            Float answer;
            answer = val * 33.8140227f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[6]) && unitOutput.equals(vUnits[1])) {
            Float answer;
            answer = val * 4.22675284f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[6]) && unitOutput.equals(vUnits[2])) {
            Float answer;
            answer = val * 1.05668821f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[6]) && unitOutput.equals(vUnits[3])) {
            Float answer;
            answer = val * 2.11337642f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[6]) && unitOutput.equals(vUnits[4])) {
            Float answer;
            answer = val / 0.26417205f;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(vUnits[6]) && unitOutput.equals(vUnits[5])) {
            Float answer;
            answer = val * 1000;
            String answerString = Float.toString(answer);
            VOutput.setText(answerString);
        } else if(unitInput.equals(unitOutput)) {
            VOutput.setText(VInput.getText());
        }
    }
}