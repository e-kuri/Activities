package com.mobile_apps.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String aString;
    EditText et2;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("lonely", "lonelyString");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et2 = (EditText) findViewById(R.id.t1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 666 && resultCode == RESULT_OK){
            et2.setText(data.getStringExtra("t2"));
        }

    }

    public void onGo22(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("t1", et2.getText().toString());
        //startActivity(i);
        startActivityForResult(i, 666);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        aString = savedInstanceState.getString("t2");
    }
}
