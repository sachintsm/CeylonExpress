package com.industrialmaster.ceylonexpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Signup_Success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__success);
    }
    public void deals(View v){
        Intent intent = new Intent(this, deals.class);
        startActivity(intent);
    }
}
