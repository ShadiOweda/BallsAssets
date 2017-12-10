package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String studentstext;
        studentstext = "This is the 2nd attempt after watching your video...." ;
        final ImageView ballDisplay =   findViewById(R.id.image_eightBall) ;
        final  int [] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        Button myButton ;
        myButton =   findViewById(R.id.askButton) ;
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumberGenerator = new Random () ;
                int number = randomNumberGenerator.nextInt(5) ;
                ballDisplay.setImageResource(ballArray [number]);


              //  Log.d(studentstext) ;















            }
        });




    }
}
