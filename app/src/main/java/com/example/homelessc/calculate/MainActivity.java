package com.example.homelessc.calculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email,pass;
    Button bt_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = (EditText)findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.pass);
        bt_login = (Button)findViewById(R.id.bt_login);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("Admin@Fuckyou")
                        &&pass.getText().toString().equals("123456789")){
                    Intent Tusk=new Intent(MainActivity.this,CalculateActivity.class);
                    startActivity(Tusk);
                }else {
                    Toast.makeText(getApplicationContext(),
                            "Fuck you pass",Toast.LENGTH_LONG).show();
                }
            }
        });



    }



}
