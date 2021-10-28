package com.example.playcards;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity2 extends AppCompatActivity
{
    EditText c1,c2,c3,c4,c5;
    Button b3; String temp; int sum = 0;
    String[] sortedCards = new String[5];
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Bundle extras = getIntent().getExtras();
        Intent i = getIntent();
        c1 = findViewById(R.id.C1);
        c2 = findViewById(R.id.C2);
        c3 = findViewById(R.id.C3);
        c4 = findViewById(R.id.C4);
        c5 = findViewById(R.id.C5);
        b3 = findViewById(R.id.B3);
        String card1 = i.getStringExtra("Card1");
        String card2 = i.getStringExtra("Card2");
        String card3 = i.getStringExtra("Card3");
        String card4 = i.getStringExtra("Card4");
        String card5 = i.getStringExtra("Card5");
        sortedCards[0] = card1;
        sortedCards[1] = card2;
        sortedCards[2] = card3;
        sortedCards[3] = card4;
        sortedCards[4] = card5;
        for (int j = 0; j < 5; j++)
        {
            for (int k = 0; k < 5; k++)
            {
                if (Integer.parseInt(sortedCards[j]) < Integer.parseInt(sortedCards[k]))
                {
                    temp = sortedCards[j];
                    sortedCards[j] = sortedCards[k]; sortedCards[k] = temp;
                }
            }
        }
        for (int j = 0; j < 5; j++)
        {
            sum += Integer.parseInt(sortedCards[j]);
        }
        c1.setText(sortedCards[0]);
        c2.setText(sortedCards[1]);
        c3.setText(sortedCards[2]);
        c4.setText(sortedCards[3]);
        c5.setText(sortedCards[4]);
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
        public void onClick(View v)
            {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            i. putExtra("c1", sortedCards[0]);
            i.putExtra("c2", sortedCards[1]);
            i.putExtra("c3", sortedCards[2]);
            i.putExtra("c4", sortedCards[3]);
            i.putExtra("c5", sortedCards[4]);
            i.putExtra("sum", String.valueOf(sum));
            setResult(RESULT_OK, i);
            finish();
        }
        });
    }
}