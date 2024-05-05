package com.truedev.oneui.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.truedev.oneui.colorpicker.widget.SeslColorPickerDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.colorPicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SeslColorPickerDialog(MainActivity.this, new SeslColorPickerDialog.OnColorSetListener() {
                    @Override
                    public void onColorSet(int color) {

                    }
                }).show();
            }
        });
    }
}