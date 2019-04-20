package com.hh.bmicaculator_20190420;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText heightEdt;
    private EditText weightEdt;
    private android.widget.Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues(){

        }


    }

    void setValues(){

    }

    void setupEvents(){

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


    void bindViews(){
        this.okBtn = (Button) findViewById(R.id.okBtn);
        this.weightEdt = (EditText) findViewById(R.id.weightEdt);
        this.heightEdt = (EditText) findViewById(R.id.heightEdt);

    }


}
