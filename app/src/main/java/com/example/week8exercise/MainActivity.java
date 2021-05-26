package com.example.week8exercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etName,etEmail,etCell,etContestDate,etContestTime;
    Button login,webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=findViewById(R.id.et_Name);
        etEmail=findViewById(R.id.et_email);
        etCell=findViewById(R.id.et_cell);
        etContestDate=findViewById(R.id.et_contestDate);
        etContestTime=findViewById(R.id.et_ContestTime);

        login=findViewById(R.id.buttonLogin);
        webview=findViewById(R.id.buttonWebview);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().length()>0){
                    Toast.makeText(MainActivity.this, etName.getText().toString()+",thank you for submitting your data", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Please enter your Name", Toast.LENGTH_SHORT).show();
                }
            }
        });

        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

    }
}