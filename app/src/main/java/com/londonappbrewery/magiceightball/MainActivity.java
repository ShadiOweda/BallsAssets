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

        Button askButton ;
        askButton =  (Button) findViewById(R.id.askButton) ;
        final ImageView ballDisplay = (ImageView)  findViewById(R.id.image_eightBall) ;

        final  int [] ballArray = {

                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,

        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomnumgen = new Random () ;
                int number = randomnumgen.nextInt(5) ;
              //  Log.d("Debugging ijn progress...", "Keep Asking:" + number  ) ;
               ballDisplay.setImageResource(ballArray [number]);














            }
        });




    }
}
