package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn  = (Button)findViewById(R.id.btn1);
        EditText txt1 = (EditText)findViewById(R.id.txt1);
        EditText txt2 = (EditText)findViewById(R.id.txt2);
        EditText txt3 = (EditText)findViewById(R.id.txt3);
        EditText txt4= (EditText)findViewById(R.id.txt4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"your name is "+txt1.getText().toString()+"\nAnd your class is "+txt2.getText().toString()+"\nRoll no."+txt3.getText().toString()  +"\nage is :"+txt4.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}