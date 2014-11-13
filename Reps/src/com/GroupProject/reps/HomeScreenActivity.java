package com.GroupProject.reps;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.app.Activity;

// -------------------------------------------------------------------------
/**
 *  Creates the home screen and defines how the buttons interact.
 *
 *  @author Ryan
 *  @version Nov 12, 2014
 */
public class HomeScreenActivity extends Activity
{
    Button b_createWorkout;
    Button b_library;
    Button b_stats;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Creates the home screen and connects it to a .xml
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        //Connects the button field to an actual button
        b_createWorkout = (Button) findViewById(R.id.create_workout);
        b_library = (Button) findViewById(R.id.library);
        b_stats = (Button) findViewById(R.id.stats);

        //Opens Create Workout screeen when clicked
        b_createWorkout.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                startActivity(new Intent("com.GroupProject.reps.CREATE_WORKOUT"));

            }
        });

        //Opens the Library when clicked
        b_library.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                startActivity(new Intent("com.GroupProject.reps.OPEN_LIBRARY"));

            }
        });

        //Opens the stats when clicked
        b_stats.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                startActivity(new Intent("com.GroupProject.reps.VIEW_STATS"));

            }
        });

        //New Intents can be viewed in the AndroidManifest
    }

    @Override
    protected void onDestroy()
    {
        // TODO Auto-generated method stub
        super.onDestroy();
    }

}
