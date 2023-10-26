package com.example.maml_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewKt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.textView);
        Button btPindah1 = findViewById(R.id.button);
        Button btPindah2 = findViewById(R.id.button2);
        btPindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(MainActivity.this, ActivitySatu.class);
                startActivity(iPindah1);
            }
        });
        btPindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah2 = new Intent(MainActivity.this, ActivityDua.class);
                startActivity(iPindah2);


            }
        });
    }
}