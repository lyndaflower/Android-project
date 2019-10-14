package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FinalActivity extends AppCompatActivity {
private TextView mView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
mView = (TextView) findViewById(R.id.view1) ;

        Intent choice = getIntent();
        String name = choice.getStringExtra("make");
        mView.setText("name : " + name );

    }
}
