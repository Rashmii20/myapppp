package com.example.happy.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText e1, e2;
    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView2);
    }


    public void addition_function(View v) {

        int a = Integer.parseInt(e1.getText().toString());
        int b = Integer.parseInt(e2.getText().toString());
        int c = a + b;
        tv.setText(Integer.toString(c));

    }

}


