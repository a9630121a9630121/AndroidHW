package com.example.android.hw_0411;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                EditText et = findViewById(R.id.editText);
                Intent i = new Intent(MainActivity.this, NewActivity.class);
                i.putExtra("location", et.getText().toString());
                startActivity(i);
                //startActivity(new Intent(MainActivity.this, NewActivity.class));
                //TextView tv = (TextView) findViewById(R.id.textView);
                //tv.setText("B10533024: " + input);
            }
        });
    }
}


