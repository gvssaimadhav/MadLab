package com.example.currconv;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle; import
        android.view.View; import
        android.widget.Button; import
        android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    TextView t2;
    RadioGroup rg;
    RadioButton r1;
    Button b1;
    String op;
    double res;
    String result;
    int n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.RG1);
        t1 = findViewById(R.id.T1);
        t2 = findViewById(R.id.T2);
        b1 = findViewById(R.id.B1);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int i = rg.getCheckedRadioButtonId();
                r1 = findViewById(i);
                op = r1.getText().toString();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op.equals("USD")) {
                    n = Integer.parseInt(t1.getText().toString());
                    res = (double)n * 0.014;
                }
                else if (op.equals("EURO")) {
                    n =Integer.parseInt(t1.getText().toString());
                    res = (double)n * 0.011;
                }
                else if (op.equals("YEN")) {
                    n =Integer.parseInt(t1.getText().toString());
                    res = (double)n * 1.45;
                }
                result = Double.toString(res);
                t2.setText(result);
            }
        });
    }
}