package com.example.viikko8veetialatalo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private Button add;
    private Button divide;
    private Button multiply;
    private Button subtract;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        add = (Button) findViewById(R.id.add);
        divide = (Button) findViewById(R.id.divide);
        multiply = (Button) findViewById(R.id.multiply);
        subtract = (Button) findViewById(R.id.subtract);
    }

    public void add(View view) {
        System.out.println("add!");
        String strn1 = number1.getText().toString();
        String strn2 = number2.getText().toString();
        double dln1 = Double.parseDouble(strn1);
        double dln2 = Double.parseDouble(strn2);
        double calc = dln1 + dln2;
        TextView answer = (TextView) findViewById(R.id.answer);
        String display = String.valueOf(calc);
        answer.setText(display);
    }

    public void divide(View view) {
        System.out.println("divide!");
        String strn1 = number1.getText().toString();
        String strn2 = number2.getText().toString();
        double dln1 = Double.parseDouble(strn1);
        double dln2 = Double.parseDouble(strn2);
        double calc = dln1 / dln2;
        TextView answer = (TextView) findViewById(R.id.answer);
        String display = String.valueOf(calc);
        answer.setText(display);
    }

    public void subtract(View view) {
        System.out.println("subtract");
        String strn1 = number1.getText().toString();
        String strn2 = number2.getText().toString();
        double dln1 = Double.parseDouble(strn1);
        double dln2 = Double.parseDouble(strn2);
        double calc = dln1 - dln2;
        TextView answer = (TextView) findViewById(R.id.answer);
        String display = String.valueOf(calc);
        answer.setText(display);
    }

    public void multiply(View view) {
        System.out.println("multiply");
        String strn1 = number1.getText().toString();
        String strn2 = number2.getText().toString();
        double dln1 = Double.parseDouble(strn1);
        double dln2 = Double.parseDouble(strn2);
        double calc = dln1 * dln2;
        TextView answer = (TextView) findViewById(R.id.answer);
        String display = String.valueOf(calc);
        answer.setText(display);
    }

}