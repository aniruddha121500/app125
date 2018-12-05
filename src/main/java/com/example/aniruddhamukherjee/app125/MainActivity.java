package com.example.aniruddhamukherjee.app125;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonQuote = (Button) findViewById(R.id.buttonBoth);
        Button buttonImage = (Button) findViewById(R.id.button2);
        Button buttonBoth = (Button) findViewById(R.id.button3);
        View imageView = (View) findViewById(R.id.imageView);

    }
}
