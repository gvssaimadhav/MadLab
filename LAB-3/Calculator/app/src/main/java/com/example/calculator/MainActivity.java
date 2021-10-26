package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity; import android.os.Bundle;
import android.view.View;
import android.widget.Button; import android.widget.TextView;
public class MainActivity extends AppCompatActivity
{
    TextView t1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bd,bm,bc,be;
    int res = 0, temp = 0;
    String t,r,op;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.T1);
        b0 = findViewById(R.id.B0);
        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);
        b3 = findViewById(R.id.B3);
        b4 = findViewById(R.id.B4);
        b5 = findViewById(R.id.B5);
        b6 = findViewById(R.id.B6);
        b7 = findViewById(R.id.B7);
        b8 = findViewById(R.id.B8);
        b9 = findViewById(R.id.B9);
        ba = findViewById(R.id.BA);
        bs = findViewById(R.id.BS);
        bd = findViewById(R.id.BD);
        bm = findViewById(R.id.BM);
        bc = findViewById(R.id.BC);
        be = findViewById(R.id.BE);
        b0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            t = t1.getText().toString();
            r = t + "0";
            t1.setText(r);
            }
        });
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            t = t1.getText().toString();
            r = t + "1";
            t1.setText(r);
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
        public void onClick(View v)
            {
            t = t1.getText().toString();
            r = t + "2";
            t1.setText(r);
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            t = t1.getText().toString();
            r = t + "3";
            t1.setText(r);
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            t = t1.getText().toString();
            r = t + "4";
            t1.setText(r);
        }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            t = t1.getText().toString();
            r = t + "5";
            t1.setText(r);
        }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            t = t1.getText().toString();
            r = t + "6";
            t1.setText(r);
        }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            t = t1.getText().toString();
            r = t + "7";
            t1.setText(r);
        }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            t = t1.getText().toString();
            r = t + "8";
            t1.setText(r);
        }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            t = t1.getText().toString();
            r = t + "9";
            t1.setText(r);
        }
        });
        ba.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            op = "+";
            temp = Integer.parseInt(t1.getText().toString());
            t1.setText("");
        }
        });
        bs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            op = "-";
            temp = Integer.parseInt(t1.getText().toString());
            t1.setText("");
        }
        });
        bd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                op = "/";
                temp = Integer.parseInt(t1.getText().toString());
                t1.setText("");
        }
        });
        bm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            op = "*";
            temp = Integer.parseInt(t1.getText().toString());
            t1.setText("");
        }
        });
        bc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            temp = 0;
            t1.setText("");
        }
        });
        be.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            if (op.equals("+"))
            {
                res = temp + Integer.parseInt(t1.getText().toString());
                t1.setText(String.valueOf(res));
            }
            else if (op.equals("-"))
            {
                res = temp - Integer.parseInt(t1.getText().toString());
                t1.setText(String.valueOf(res));
            }
            else if (op.equals("/"))
            {
                res = temp / Integer.parseInt(t1.getText().toString());
                t1.setText(String.valueOf(res));
            }
            else if (op.equals("*")) {
                res = temp * Integer.parseInt(t1.getText().toString());
                t1.setText(String.valueOf(res));
            }
        }
        });
    }
}