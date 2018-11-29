package com.example.lenovo.ledapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox LedCheck1 = (CheckBox)findViewById(R.id.LED_1);
        final CheckBox LedCheck2 = (CheckBox)findViewById(R.id.LED_2);
        final CheckBox LedCheck3 = (CheckBox)findViewById(R.id.LED_3);
        final CheckBox LedCheck4 = (CheckBox)findViewById(R.id.LED_4);

        Button Button_on = (Button)findViewById(R.id.BUTTON_1);
        Button Button_off = (Button)findViewById(R.id.BUTTON_2);
        Button_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LedCheck1.setChecked(true);
                LedCheck2.setChecked(true);
                LedCheck3.setChecked(true);
                LedCheck4.setChecked(true);
                Log.d("123","Button_on");
            }
        });

        Button_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LedCheck1.setChecked(false);
                LedCheck2.setChecked(false);
                LedCheck3.setChecked(false);
                LedCheck4.setChecked(false);
                Log.d("123","Button_off");
            }
        });

        LedCheck1.setOnCheckedChangeListener(this);
        LedCheck2.setOnCheckedChangeListener(this);
        LedCheck3.setOnCheckedChangeListener(this);
        LedCheck4.setOnCheckedChangeListener(this);
    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch(buttonView.getId()){
            case R.id.LED_1:
                if(isChecked == true){
                    Log.d("123","Led1 true");
                }else{
                    Log.d("123","Led1 false");
                }
                break;
            case R.id.LED_2:
                if(isChecked == true){
                    Log.d("123","Led2 true");
                }else{
                    Log.d("123","Led2 false");
                }
                break;
            case R.id.LED_3:
                if(isChecked == true){
                    Log.d("123","Led3 true");
                }else{
                    Log.d("123","Led3 false");
                }
                break;
            case R.id.LED_4:
                if(isChecked == true){
                    Log.d("123","Led4 true");
                }else{
                    Log.d("123","Led4 false");
                }
                break;
        }
    }
}
