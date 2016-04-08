package com.example.carlos.taller4carapapa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    public void checksom(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView7);
        if (view.getId() == R.id.checksom) {
            img.setImageResource(R.drawable.hat);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }

    public void checkcej(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView4);

        if (view.getId() == R.id.checkcej) {
            img.setImageResource(R.drawable.eyebrows);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }


    public void checkojo(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView5);
        if (view.getId() == R.id.checkojo) {
            img.setImageResource(R.drawable.eyes);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }

    public void checkgaf(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView6);
        if (view.getId() == R.id.checkgaf) {
            img.setImageResource(R.drawable.glasses);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }



    public void checkore(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView3);
        if (view.getId() == R.id.checkore) {
            img.setImageResource(R.drawable.ears);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }


    public void checknar(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView10);
        if (view.getId() == R.id.checknar) {
            img.setImageResource(R.drawable.nose);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }


    public void checkbig(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView9);
        if (view.getId() == R.id.checkbig) {
            img.setImageResource(R.drawable.mustache);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }


    public void checkbra(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView2);
        if (view.getId() == R.id.checkbra) {
            img.setImageResource(R.drawable.arms);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }


    public void checkboc(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView8);
        if (view.getId() == R.id.checkboc) {
            img.setImageResource(R.drawable.mouth);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }


    public void checkcue(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView);
        if (view.getId() == R.id.checkcue) {
            img.setImageResource(R.drawable.body);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }


    public void checkzap(View view) {
        ImageView img = (ImageView) findViewById(R.id.imageView11);
        if (view.getId() == R.id.checkzap) {
            img.setImageResource(R.drawable.shoes);
            img.setVisibility(View.VISIBLE);

        }
        else {
            img.setVisibility(View.INVISIBLE);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
