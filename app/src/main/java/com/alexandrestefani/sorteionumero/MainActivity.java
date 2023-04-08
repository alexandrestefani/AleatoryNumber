package com.alexandrestefani.sorteionumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomNumber(View view){
        TextView text = findViewById(R.id.textView2);
        int number = new Random().nextInt(11);

        text.setText("O numero escolhido "+ number);

    }
}