package com.example.ip1part;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText text1 =findViewById(R.id.numberOne);
        EditText text2 =findViewById(R.id.numberTwo);
        TextView outputText = findViewById(R.id.functionOutput);
        Button divideBtn = findViewById(R.id.devidebutton);
        Button addBtn =  findViewById(R.id.addbutton);
        Button subBtn = findViewById(R.id.subtractbutton);
        Button modBtn = findViewById(R.id.modbutton);
        Button powerBtn = findViewById(R.id.powerbutton);
        String wow= "wow this sucks";
        String s1 = text1.getText().toString();
        String s2 = text2.toString();
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputText.setText(wow + s1 + s2);
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputText.setText("In sub");
            }
        });
        modBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputText.setText("In mod");
            }
        });
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputText.setText("in /");
            }
        });
        powerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputText.setText("in power");
            }
        });
    }

    public void mod(int x, int y,TextView outputText) {
        int mod = x % y;
        String xstring = String.valueOf(x);
        String ystring = String.valueOf(y);
        String modstring = String.valueOf(mod);
        outputText.setText(xstring + " % "+ystring+" = "+modstring);

    }

    public void addition(int x, int y,TextView outputText) {
        outputText.setText("");
    }

  /*  public void subtract(int x, int y) {
    }

    public void divide(int x, int y) {
    }

    public void power(int x, int y) {
        int root = x;
        for (int i = 0; i < y; i++) {
            x = x * root;
        }

    }
    */
}
    
   
