package com.example.upass;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText t1,t2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Welcome to Login Page", Toast.LENGTH_SHORT).show();
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.getText().toString().equals("madhav") && t2.getText().toString().equals("vit"))
                    Toast.makeText(getApplicationContext(),(t1.getText()+" Login Successful"),Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),("Login Failed! Please Enter Correct Details"),Toast.LENGTH_SHORT).show();
            }
        });
    }
}