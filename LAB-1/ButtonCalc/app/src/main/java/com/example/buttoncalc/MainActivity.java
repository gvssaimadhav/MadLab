package com.example.buttoncalc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView t3;
    EditText t1,t2;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(t1.getText().toString());
                int b=Integer.parseInt(t2.getText().toString());
                int c=a+b;
                t3.setText(String.valueOf(c));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(t1.getText().toString());
                int b=Integer.parseInt(t2.getText().toString());
                int c=a-b;
                t3.setText(String.valueOf(c));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(t1.getText().toString());
                int b=Integer.parseInt(t2.getText().toString());
                int c=a*b;
                t3.setText(String.valueOf(c));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(t1.getText().toString());
                int b=Integer.parseInt(t2.getText().toString());
                int c=a/b;
                t3.setText(String.valueOf(c));
            }
        });
    }
}