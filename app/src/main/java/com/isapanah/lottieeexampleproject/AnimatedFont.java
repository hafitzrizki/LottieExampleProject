package com.isapanah.lottieeexampleproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class AnimatedFont extends AppCompatActivity {

    LottieFontViewGroup fontView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typography_demo);

        fontView = (LottieFontViewGroup) findViewById(R.id.fontView);
    }
}
