package com.example.van.lab7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
    implements PaletteFragment.onSendColor {

    CanvasFragment myCanvasFragment;
    PaletteFragment myPaletteFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myPaletteFragment= new PaletteFragment();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.palette_container , myPaletteFragment)
                .commit();

        myCanvasFragment = new CanvasFragment();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.canvas_container, myCanvasFragment)
                .commit();
    }

    @Override
    public void sendColor(String color) {
        myCanvasFragment.changeColor(color);
    }
}

