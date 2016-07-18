package com.mobile_apps.activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et = (EditText)findViewById(R.id.name);

        Intent i = getIntent();
        et.setText(i.getStringExtra("t1"));
    }

    public void onGoBack(View view) {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("t2", et.getText().toString());
        setResult(RESULT_OK, i);
        finish();
    }
}
