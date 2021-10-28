package com.example.playcards;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;
public class MainActivity extends AppCompatActivity
{
    EditText t1,t2,t3,t4,t5,t7;
    Button b1,b2;
    int[] cards = new int[5];
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.T1);
        t2 = findViewById(R.id.T2);
        t3 = findViewById(R.id.T3);
        t4 = findViewById(R.id.T4);
        t5 = findViewById(R.id.T5);
        t7 = findViewById(R.id.T7);
        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            for (int k = 0; k < 5; k++)
            {
                cards[k] = rand.nextInt(14);
            }
            t1.setText(String.valueOf(cards[0]));
            t2.setText(String.valueOf(cards[1]));
            t3.setText(String.valueOf(cards[2]));
            t4.setText(String.valueOf(cards[3]));
            t5.setText(String.valueOf(cards[4]));
        }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i. putExtra("Card1", t1.getText().toString());
            i.putExtra("Card2", t2.getText().toString());
            i.putExtra("Card3", t3.getText().toString());
            i.putExtra("Card4", t4.getText().toString());
            i.putExtra("Card5", t5.getText().toString());
            startActivityForResult(i, 2);
        }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2)
        {
            if(resultCode == RESULT_OK)
            {
                t1.setText(data.getStringExtra("c1"));
                t2.setText(data.getStringExtra("c2"));
                t3.setText(data.getStringExtra("c3"));
                t4.setText(data.getStringExtra("c4"));
                t5.setText(data.getStringExtra("c5"));
                t7.setText(data.getStringExtra("sum"));
            }
        }
    }
}