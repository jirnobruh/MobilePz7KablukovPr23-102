package com.example.pz7kablukovpr23102;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layouts);

        setContentView(R.layout.linear_layouts);

        Button btnClick = findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinearLayoutsActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button btnClick1 = findViewById(R.id.btnClick1);
        btnClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinearLayoutsActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button btnClick2 = findViewById(R.id.btnClick2);
        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinearLayoutsActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
