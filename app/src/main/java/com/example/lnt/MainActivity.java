package com.example.lnt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void clickHandler(View view)
     {
         String name=nameEditText.getText().toString();
         Toast.makeText( this,"welcome to android", Toast.LENGTH_SHORT).show();
     }
}