package com.example.compoundviewjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button)findViewById(R.id.btnAdd);
        /*findViewById(R.id.btnAdd).setOnClickListener(this::onClick);
        final LayoutInflater inflater=getLayoutInflater();
       inflater.inflate(R.layout.compound_view,findViewById(R.id.lytCompound),true);*/

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final LayoutInflater inflater=getLayoutInflater();
                inflater.inflate(R.layout.compound_view,findViewById(R.id.lytCompound),true);
            }
        });
    }

   /* private void onClick(View view) {
        final LayoutInflater inflater=  (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        //final LayoutInflater inflater=LayoutInflater.from(this);
        //final LayoutInflater inflater=getLayoutInflater();
        inflater.inflate(R.layout.compound_view,findViewById(R.id.lytCompound),true);

    }*/
}
