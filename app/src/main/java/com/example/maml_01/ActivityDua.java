package com.example.maml_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityDua extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dua);

        TextView tv1 = findViewById(R.id.textView);
        Button btPindah1 = findViewById(R.id.button5);
        Button btPindah2 = findViewById(R.id.button6);
        btPindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(ActivityDua.this, ActivitySatu.class);
                startActivity(iPindah1);
            }
        });
        btPindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah2 = new Intent(ActivityDua.this, MainActivity.class);
                startActivity(iPindah2);            }
        });
    }
}
