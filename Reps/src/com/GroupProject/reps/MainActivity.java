package com.GroupProject.reps;

import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;
import android.app.Activity;
import android.os.Bundle;


// -------------------------------------------------------------------------
/**
 *  This is is the Activity that is launched for the splash screen.
 *
 *  @author Ryan
 *  @version Nov 12, 2014
 */
public class MainActivity extends Activity
{
    //If we want a sound effect during the splash
    //MediaPlayer splashSound;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //creates the activity and connects it with an .xml file
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //splashSound = MediaPlayer.create(this, R.raw.logo_noise);
        //splashSound.start();

        //Create and define a new thread so multiple things can run at once
        Thread logoTimer = new Thread() {

            public void run()
            {
                try
                {
                    int time = 0;

                    //Waits for 7 seconds
                    while(time < 7000)
                    {
                        //Makes the rest of the app paused
                        sleep(100);
                        time = time + 100;
                    }
                    //This while loop is not necessary; sleep(7000) would execute the same thing
                    //However, if we wanted to skip the splash screen, this loop will come in handy

                    //When the timer is up, a new activity is created.
                    //The intent is so the Android Manifest knows what to do.
                    startActivity(new Intent(
                        "com.GroupProject.reps.CLEARSCREEN"));

                }
                catch (InterruptedException e)
                {
                    //Exception thrown if shit goes wrong idk
                    e.printStackTrace();
                }
                finally
                {
                    //closes the activity when the screen changes
                    finish();
                }
            }
        };

        //Start the thread
        logoTimer.start();
    }

}
