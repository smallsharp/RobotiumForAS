package com.lee.robotiumforas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnTapMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTapMe = (Button) findViewById(R.id.btnTapMe);
        btnTapMe.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "别点我啦…", Toast.LENGTH_SHORT).show();
    }
}
