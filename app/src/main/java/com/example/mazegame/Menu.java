package com.example.mazegame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private int layoutNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button endlessModeButton = findViewById(R.id.endlessModeButton);
        Button customModeSettingsButton = findViewById(R.id.customModeButton);

        endlessModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.endless_mode);
                layoutNum = 2;

                Button hintButton = (Button) findViewById(R.id.hintButton);
                hintButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        /*getHint();*/
                    }
                });
            }
        });

        customModeSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.custom_mode_settings);
                layoutNum = 2;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(layoutNum == 2){
            layoutNum = 1;
            setContentView(R.layout.menu);
        }
        else{
            super.onBackPressed();
        }
    }

    public void getHint(int width, int height){

    }
}