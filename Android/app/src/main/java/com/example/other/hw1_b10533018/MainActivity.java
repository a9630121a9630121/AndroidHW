package com.example.other.hw1_b10533018;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mBUTTON;
    private EditText mEntey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBUTTON=(Button)findViewById(R.id.mButton);
        mEntey=(EditText)findViewById(R.id.mEntry);

        mBUTTON.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context context = MainActivity.this;
                String entryText=mEntey.getText().toString();
                Class CActivity=ChildActivity.class;
                Intent startNewAct=new Intent(context,CActivity);
                startNewAct.putExtra(Intent.EXTRA_TEXT,entryText);
                startActivity(startNewAct);
            }
        });


    }
}
