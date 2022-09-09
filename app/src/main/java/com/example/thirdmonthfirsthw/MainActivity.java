package com.example.thirdmonthfirsthw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton btnNext;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.et_message);
        btnNext = findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result = findViewById(R.id.tv_result);
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("key 1",editText.getText().toString());
                startActivity(intent);
                finishAffinity();

            }
        });
    }
}