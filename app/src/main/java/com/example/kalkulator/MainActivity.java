package com.example.kalkulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    EditText InputNumber1;
    EditText InputNumber2;
    Spinner spoperator;
    Button btncalculate;
    EditText hasil;

    String selected;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InputNumber1 = (EditText) findViewById(R.id.edt_number1);
                InputNumber2 = (EditText) findViewById(R.id.edt_number2);
                spoperator = (Spinner) findViewById(R.id.spoperator);
               // btncalculate = (Button) findViewById(R.id.btncalculate);
                hasil = (EditText) findViewById(R.id.edt_hasil);

                selected = (String) spoperator.getSelectedItem();

                if(selected.trim().equals("+")){
                    float Hasil = Float.parseFloat(InputNumber1.getText().toString())+Float.parseFloat(InputNumber2.getText().toString());
                    hasil.setText(Float.toString(Hasil));
                }if(selected.trim().equals("-")){
                    float Hasil = Float.parseFloat(InputNumber1.getText().toString())-Float.parseFloat(InputNumber2.getText().toString());
                    hasil.setText(Float.toString(Hasil));
                }if(selected.trim().equals("*")){
                    float Hasil = Float.parseFloat(InputNumber1.getText().toString())*Float.parseFloat(InputNumber2.getText().toString());
                    hasil.setText(Float.toString(Hasil));
                }if(selected.trim().equals("/")){
                    float Hasil = Float.parseFloat(InputNumber1.getText().toString())/ Float.parseFloat(InputNumber2.getText().toString());
                    hasil.setText(Float.toString(Hasil));
                }
            }
        };

        btncalculate = (Button) findViewById(R.id.btncalculate);
        btncalculate.setOnClickListener(listener);


    }
}

