package com.project.matheuscatossi.example_extends_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by matheuscatossi on 5/14/17.
 */

public class FirstActivity extends MainActivity{

    Button btn_acess_second_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn_acess_second_activity = (Button) findViewById(R.id.btn_access_second_activity);
        btn_acess_second_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

}
