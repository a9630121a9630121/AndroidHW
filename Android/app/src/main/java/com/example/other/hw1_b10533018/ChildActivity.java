package com.example.other.hw1_b10533018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ChildActivity  extends AppCompatActivity {

    private TextView cDisplay;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        cDisplay=(TextView)findViewById(R.id.display);

        Intent intent_getSomething=getIntent();
        if(intent_getSomething.hasExtra(Intent.EXTRA_TEXT)){
            String showText=intent_getSomething.getStringExtra(Intent.EXTRA_TEXT);
            cDisplay.setText(showText);
        }
    }
}