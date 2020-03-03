package com.bb.calculator101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView userInputTextView;

    private double valueA = 0;
    private double valueB = 0;
    private double valueC = 0;

    private int operator = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, getString(R.string.five_number),Toast.LENGTH_SHORT).show();
        Toast.makeText(this, getString(R.string.greeting_text, "Dalo", 47),Toast.LENGTH_LONG).show();
        userInputTextView = findViewById(R.id.user_input_textview);
    }


    public void calcClick(View view) {
        switch (view.getId()) {

            case R.id.ac_button:
                valueA = 0;
                valueB = 0;
                valueC = 0;
                userInputTextView.setText("0");
                break;
            case R.id.zero_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim());
                if(userInputTextView.getText().toString().trim().contains("."))
                    userInputTextView.append("0");
                else if(valueC!=0)
                    userInputTextView.append("0");
                break;
            case R.id.one_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim());
                if(userInputTextView.getText().toString().trim().contains("."))
                    userInputTextView.append("1");
                else if(valueC==0)
                    userInputTextView.setText("1");
                else
                    userInputTextView.append("1");
                break;
            case R.id.two_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim());
                if(userInputTextView.getText().toString().trim().contains("."))
                    userInputTextView.append("2");
                else if(valueC==0)
                    userInputTextView.setText("2");
                else
                    userInputTextView.append("2");
                break;
            case R.id.three_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim());
                if(userInputTextView.getText().toString().trim().contains("."))
                    userInputTextView.append("3");
                else if(valueC==0)
                    userInputTextView.setText("3");
                else
                    userInputTextView.append("3");
                break;
            case R.id.four_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim());
                if(userInputTextView.getText().toString().trim().contains("."))
                    userInputTextView.append("4");
                else if(valueC==0)
                    userInputTextView.setText("4");
                else
                    userInputTextView.append("4");
                break;
            case R.id.five_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim());
                if(userInputTextView.getText().toString().trim().contains("."))
                    userInputTextView.append("5");
                else if(valueC==0)
                    userInputTextView.setText("5");
                else
                    userInputTextView.append("5");
                break;
            case R.id.six_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim());
                if(userInputTextView.getText().toString().trim().contains("."))
                    userInputTextView.append("6");
                else if(valueC==0)
                    userInputTextView.setText("6");
                else
                    userInputTextView.append("6");
                break;
            case R.id.seven_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim());
                if(userInputTextView.getText().toString().trim().contains("."))
                    userInputTextView.append("7");
                else if(valueC==0)
                    userInputTextView.setText("7");
                else
                    userInputTextView.append("7");
                break;
            case R.id.eight_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim());
                if(userInputTextView.getText().toString().trim().contains("."))
                    userInputTextView.append("8");
                else if(valueC==0)
                    userInputTextView.setText("8");
                else
                    userInputTextView.append("8");
                break;
            case R.id.nine_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim());
                if(userInputTextView.getText().toString().trim().contains("."))
                    userInputTextView.append("9");
                else if(valueC==0)
                    userInputTextView.setText("9");
                else
                    userInputTextView.append("9");
                break;
            case R.id.add_button:
                operator = 0;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                valueC = 0;
                break;
            case R.id.subtract_button:
                operator = 1;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                valueC = 0;
                break;
            case R.id.division_button:
                operator = 2;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                valueC = 0;
                break;
            case R.id.multiply_button:
                operator = 3;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                userInputTextView.setText("0");
                valueC = 0;
                break;
            case R.id.modulus_button:
                valueC = Double.parseDouble(userInputTextView.getText().toString().trim())/100d;
                userInputTextView.setText(Double.toString(valueB));
                valueC = 0;
                break;
            case R.id.period_button:
                if (userInputTextView.getText().toString().trim().contains("."))
                    break;
                userInputTextView.append(".");
                break;
            case R.id.neg_pos_button:
                operator = 4;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.equals_button:
                valueB = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.sin:
                operator=5;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.cos:
                operator=6;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.tan:
                operator=7;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.secondPower:
                operator=8;
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();

        }
    }

    public void operation() {
        double answer = 0;
        switch (operator) {
            case 0://addition
                answer = (valueA + valueB);
                break;
            case 1://subtraction
                answer = (valueA - valueB);
                break;
            case 2://division
                answer = (valueA / valueB);
                break;
            case 3://multiply
                answer = (valueA * valueB);
                break;
            case 4://negate
                answer = (valueA*-1);
                break;
            case 5://sin
                answer = Math.sin(valueA);
                break;
            case 6://cos
                answer = Math.cos(valueA);
                break;
            case 7://tan
                answer = Math.tan(valueA);
                break;
            case 8://second power
                answer = valueA*valueA;
                break;
        }

        userInputTextView.setText("" + Double.toString(answer));
    }
}
