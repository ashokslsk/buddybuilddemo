package com.packt.ashok.buddybuilddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int a = 0;
    int b = 1;
    int result ;

    int a1 = 0;
    int b2 = 1;
    int result1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = a/b;
    }
}
