package com.example.kawnayeen.navigationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class HelloWorld extends AppCompatActivity {

    Button navigationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        navigationBtn = findViewById(R.id.goToNav);
        navigationBtn.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
    }
}
