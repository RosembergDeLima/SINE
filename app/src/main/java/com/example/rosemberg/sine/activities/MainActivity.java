package com.example.rosemberg.sine.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rosemberg.sine.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ListarSines(View view){
        Intent intent = new Intent(this, ListarSines.class);
        startActivity(intent);
    }

    public void ListarSinesCampina(View view){
        Intent intent = new Intent(this, ListarSinesCampina.class);
        startActivity(intent);
    }
}
