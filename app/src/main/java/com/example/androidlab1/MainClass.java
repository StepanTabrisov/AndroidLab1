package com.example.androidlab1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainClass extends Activity {

    int count = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicker_layout);

        TextView score = findViewById(R.id.score);

        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                score.setText(String.valueOf(count));
                b2.setVisibility(View.VISIBLE);
                b1.setVisibility(View.INVISIBLE);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                score.setText(String.valueOf(count));
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.INVISIBLE);
            }
        });
    }
}
