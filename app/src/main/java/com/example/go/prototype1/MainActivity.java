package com.example.go.prototype1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;
public class MainActivity extends AppCompatActivity{

    private Button GO;
    private TextView SHOW;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Stuff

        SHOW = (TextView) findViewById(R.id.SHOW);
        GO = (Button)findViewById(R.id.GO);
        final String COLOR[] = {"green","red","yellow","orange", "gray", "blue","indigo","violet","white","black","brown","pink"};



        GO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();



                int randomNum = rand.nextInt(COLOR.length);
                SHOW.setText(COLOR[randomNum]);

                // handle our events




                Toast.makeText(getApplicationContext(), "Color selected", Toast.LENGTH_LONG).show();


            }
        });






    }
}
