package com.example.maml_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivitySatu extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_satu);

        TextView tv1 = findViewById(R.id.textView);
        Button btPindah1 = findViewById(R.id.button3);
        Button btPindah2 = findViewById(R.id.button4);
        btPindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(ActivitySatu.this, ActivityDua.class);
                startActivity(iPindah1);
            }
        });
        btPindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah2 = new Intent(ActivitySatu.this, MainActivity.class);
                startActivity(iPindah2);
            }
        });
    }
}
