package com.hh.bmicaculator_20190420;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    private android.widget.TextView bmiResultText;
    private android.widget.TextView bmiCaculateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        bindViews();
        setupEvents();
        setValues();

    }

    void  setupEvents(){

    }

    void setValues(){

    }

    void bindViews(){
        this.bmiCaculateText = (TextView) findViewById(R.id.bmiCaculateText);
        this.bmiResultText = (TextView) findViewById(R.id.bmiResultText);
    }
}
