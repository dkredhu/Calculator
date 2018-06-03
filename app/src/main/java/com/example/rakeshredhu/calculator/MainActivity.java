package com.example.rakeshredhu.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button addB,subB,multiB,divB;
    EditText firstNumberM,secondNumberM;
    TextView resultT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addB = (Button)findViewById(R.id.add);
        subB = (Button)findViewById(R.id.subtract);
        multiB = (Button)findViewById(R.id.multiply);
        divB = (Button)findViewById(R.id.divide);
        firstNumberM = (EditText)findViewById(R.id.firstNumber);
        secondNumberM = (EditText)findViewById(R.id.secondNumber);
        resultT = (TextView) findViewById(R.id.result);

        addB.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View view) {
                if (checkIfFieldIsEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter first and second number",Toast.LENGTH_SHORT).show();
                }

                else {
                    String a = firstNumberM.getText().toString();
                    String b = secondNumberM.getText().toString();
                    int p = Integer.parseInt(a);
                    int q = Integer.parseInt(b);
                    int result = p + q;
                    String s = String.valueOf(result);
                    resultT.setText(s);

                }
            }

        });

        subB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkIfFieldIsEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter first and second number",Toast.LENGTH_SHORT).show();
                }

                else {

                    String a = firstNumberM.getText().toString();
                    String b = secondNumberM.getText().toString();
                    int p = Integer.parseInt(a);
                    int q = Integer.parseInt(b);
                    int result = p - q;
                    String s = String.valueOf(result);
                    resultT.setText(s);
                }
            }
        });

        multiB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkIfFieldIsEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter first and second number",Toast.LENGTH_SHORT).show();
                }

                else {

                String a = firstNumberM.getText().toString();
                String b = secondNumberM.getText().toString();
                int p = Integer.parseInt(a);
                int q = Integer.parseInt(b);
                int result = p*q;
                String s = String.valueOf(result);
                resultT.setText(s);
            }
            }
        });

        divB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkIfFieldIsEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter first and second number", Toast.LENGTH_SHORT).show();
                } else {

                    String a = firstNumberM.getText().toString();
                    String b = secondNumberM.getText().toString();
                    int p = Integer.parseInt(a);
                    int q = Integer.parseInt(b);
                    int result = p / q;
                    String s = String.valueOf(result);
                    resultT.setText(s);
                }
            }
        });

    }
    
    private boolean checkIfFieldIsEmpty(){
        return TextUtils.isEmpty(firstNumberM.getText().toString()) || TextUtils.isEmpty(secondNumberM.getText().toString());
    }
}
