package com.example.textview4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);

    }
int count = 1;
    public void go(View view) {
        tv.setText("this is a click number:"+count);
        tv.setTextColor(Color.GREEN);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if ((count&7) == 0 ){
                    tv.setText("Boom!");
                }
                else{
                    tv.setText("this is a click number:"+count);
                }
            }
        });


    }
}