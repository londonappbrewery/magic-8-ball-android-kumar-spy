package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askbutton;
        askbutton=(Button)findViewById(R.id.askbutton);
        final ImageView message=(ImageView)findViewById(R.id.msg_1);
        final int[] msgarray={R.drawable.msg1,
                R.drawable.msg2,
                R.drawable.msg3,
                R.drawable.msg4,
                R.drawable.msg5,
                R.drawable.msg6,};
        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator=new Random();
                int number=randomNumberGenerator.nextInt(6);
                message.setImageResource(msgarray[number]);

            }
        });


    }
}
