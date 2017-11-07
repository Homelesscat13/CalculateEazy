package com.example.homelessc.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity implements
        View.OnClickListener {

    private Button btdivide,btmultiply,btminus,btplus;
    private TextView Answer ;
    private EditText G1,G2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        init();

    }
    private void init(){
        btplus = (Button)findViewById(R.id.btplus);
        btminus = (Button)findViewById(R.id.btminus);
        btmultiply = (Button)findViewById(R.id.btmultiply);
        btdivide = (Button)findViewById(R.id.btdivide);
        G1 = (EditText)findViewById(R.id.G1);
        G2 = (EditText)findViewById(R.id.G2);
        Answer = (TextView)findViewById(R.id.Answer);

        btplus.setOnClickListener(this);
        btminus.setOnClickListener(this);
        btmultiply.setOnClickListener(this);
        btdivide.setOnClickListener(this);

    }


    public void onClick(View view){
        String num1 = G1.getText().toString();
        String num2 = G2.getText().toString();


    switch (view.getId()){

        case R.id.btplus:
            int plustion = Integer.parseInt(num1) + Integer.parseInt(num2);
            Answer.setText(String.valueOf(plustion));
            break;
        case R.id.btminus:
            int minustion = Integer.parseInt(num1) - Integer.parseInt(num2);
            Answer.setText(String.valueOf(minustion));
            break;
        case R.id.btmultiply:
            int multion = Integer.parseInt(num1) * Integer.parseInt(num2);
            Answer.setText(String.valueOf(multion));
            break;
        case R.id.btdivide:
            try {
                int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                Answer.setText(String.valueOf(division));
            }catch (Exception e) {
                Answer.setText("cannot Divide");
            }
            break;


    }



    }
}
