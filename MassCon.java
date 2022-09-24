import javax.swing.JComboBox;
import javax.swing.JTextField;

public class MassCon {
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
    public MassCon(JComboBox<String> MUnit1, JComboBox<String> MUnit2, JTextField MInput,JTextField MOutput) {
        //Units
        String[] mUnits = {"Ounces", "Pounds", "US Tons", "Grams", "Kilograms"};

        //Conversions
        String firstStr = MInput.getText();
        Float val = convert(firstStr);
        String unitInput = (String)MUnit1.getSelectedItem();
        String unitOutput = (String)MUnit2.getSelectedItem();

        //Calculations
        if(unitInput.equals(mUnits[0]) && unitOutput.equals(mUnits[1])) {
            Float answer;
            answer = val / 16;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[0]) && unitOutput.equals(mUnits[2])) {
            Float answer;
            answer = val / 32000;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[0]) && unitOutput.equals(mUnits[3])) {
            Float answer;
            answer = val * 28.349523125f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[0]) && unitOutput.equals(mUnits[4])) {
            Float answer;
            answer = val / 35.2739619496f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[1]) && unitOutput.equals(mUnits[0])) {
            Float answer;
            answer = val * 16;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[1]) && unitOutput.equals(mUnits[2])) {
            Float answer;
            answer = val / 2000;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[1]) && unitOutput.equals(mUnits[3])) {
            Float answer;
            answer = val * 453.59237f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[1]) && unitOutput.equals(mUnits[4])) {
            Float answer;
            answer = val * 2.2046226218f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[2]) && unitOutput.equals(mUnits[0])) {
            Float answer;
            answer = val * 35840;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[2]) && unitOutput.equals(mUnits[1])) {
            Float answer;
            answer = val * 2240;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[2]) && unitOutput.equals(mUnits[3])) {
            Float answer;
            answer = val * 1016046.9088f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[2]) && unitOutput.equals(mUnits[4])) {
            Float answer;
            answer = val * 1016.0469088f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[3]) && unitOutput.equals(mUnits[0])) {
            Float answer;
            answer = val / 28.34523125f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[3]) && unitOutput.equals(mUnits[1])) {
            Float answer;
            answer = val / 453.59237f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[3]) && unitOutput.equals(mUnits[2])) {
            Float answer;
            answer = val / 1016046.9088f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[3]) && unitOutput.equals(mUnits[4])) {
            Float answer;
            answer = val / 1000;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[4]) && unitOutput.equals(mUnits[0])) {
            Float answer;
            answer = val * 35.2739619496f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[4]) && unitOutput.equals(mUnits[1])) {
            Float answer;
            answer = val * 2.2046226218f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[4]) && unitOutput.equals(mUnits[2])) {
            Float answer;
            answer = val / 1016.0469088f;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(mUnits[4]) && unitOutput.equals(mUnits[3])) {
            Float answer;
            answer = val * 1000;
            String answerString = Float.toString(answer);
            MOutput.setText(answerString);
        } else if(unitInput.equals(unitOutput)) {
            MOutput.setText(MInput.getText());
        }
    }
}