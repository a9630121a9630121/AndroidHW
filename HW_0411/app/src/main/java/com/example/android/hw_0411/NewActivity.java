package com.example.android.hw_0411;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


class NewActivity extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.new_activity);
        Intent in = getIntent();
        String input = in.getExtras().getString("location");
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("B10533018: " + input);
        }
}
