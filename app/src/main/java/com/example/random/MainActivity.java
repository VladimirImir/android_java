package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button generateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        textView = findViewById(R.id.textView);
        generateBtn = findViewById(R.id.generateBtn);
        /*generateBtn.setOnClickListener(view -> textView.setText("Hello Andoroid!"));*/
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val = random.nextInt(1000);
                textView.setText(Integer.toString(val));
            }
        });
    }
}