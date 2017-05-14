package com.project.matheuscatossi.example_extends_activity;

import android.os.Bundle;

/**
 * Created by matheuscatossi on 5/14/17.
 */

public class SecondActivity extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

}
