package com.facci.restaurantrr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityRR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_rr);
    }

    public void Click1(View v){
        Toast.makeText(MainActivityRR.this,"Ha seleccionado los mariscos", Toast.LENGTH_SHORT).show();
    }

    public void Click2(View v){
        Toast.makeText(MainActivityRR.this,"Ha seleccionado caldo de gallina",Toast.LENGTH_SHORT).show();
    }
    public void Click3(View v){
        Toast.makeText(MainActivityRR.this,"Ha seleccionado los camarones",Toast.LENGTH_SHORT).show();
    }
    public void Click4(View v){
        Toast.makeText(MainActivityRR.this,"Ha seleccionado los corviche",Toast.LENGTH_SHORT).show();
    }
    public void Click5(View v){
        Toast.makeText(MainActivityRR.this,"Ha seleccionado el pescado frito",Toast.LENGTH_SHORT).show();
    }
    public void Click6(View v){
        Toast.makeText(MainActivityRR.this,"Ha seleccionado verde con salprieta",Toast.LENGTH_SHORT).show();
    }
    public void Click7(View v){
        Toast.makeText(MainActivityRR.this,"Ha seleccionado arroz de mariscos ",Toast.LENGTH_SHORT).show();
    }
}
