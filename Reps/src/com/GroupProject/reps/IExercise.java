package com.GroupProject.reps;

import sofia.graphics.RectangleShape;
import sofia.graphics.Image;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Kyle
 * @version Nov 9, 2014
 */

public interface IExercise
{
    /**
     * rectangle shape reference variable for the gif
     */
    public RectangleShape gif = new RectangleShape();


    // ----------------------------------------------------------
    /**
     * sets the nameLabel to the name of the work out
     *
     * @return name of the work out
     */
    public String name();


    // ----------------------------------------------------------
    /**
     * Updates the gif display to the current work out gif
     *
     * @return gif of the work out
     */
    public Image gif();


    // ----------------------------------------------------------
    /**
     * Returns a number which represents the area of the body which this
     * exercise works out. 1 = Shoulders 2 = Chest 3 = Arms 4 = Back 5 =
     * Abdominal 6 = Legs
     *
     * @return the number representation of the area being worked out.
     */
    public int type();
}




// -------------------------------------------------------------------------
/**
 * represents a weighted squat exercise with a gif and region of body.
 *
 * @author Kyle
 * @version Nov 10, 2014
 */
class WeightedSquats
    extends RectangleShape
    implements IExercise
{
    // ----------------------------------------------------------
    /**
     * Create a new Squats object.
     */
    public WeightedSquats()
    {
        setImage("WeightedSquats");
    }


    public String name()
    {
        return "Weighted Squats";
    }


    public Image gif()
    {
        return gif.getImage();
    }


    public int type()
    {
        return 6;
    }

}




// -------------------------------------------------------------------------
/**
 * represents a bench press exercise with a gif and region of body.
 *
 * @author Kyle
 * @version Nov 10, 2014
 */
class BenchPress
    extends RectangleShape
    implements IExercise
{
    // ----------------------------------------------------------
    /**
     * Create a new bench press object.
     */
    public BenchPress()
    {
        setImage("BenchPress");
    }


    public String name()
    {
        return "Bench Press";
    }


    public Image gif()
    {
        return gif.getImage();
    }


    public int type()
    {
        return 2;
    }

}




// -------------------------------------------------------------------------
/**
 * represents a shoulder press exercise with a gif and region of body.
 *
 * @author Kyle
 * @version Nov 10, 2014
 */
class ShoulderPress
    extends RectangleShape
    implements IExercise
{
    // ----------------------------------------------------------
    /**
     * Create a new Shoulder press object.
     */
    public ShoulderPress()
    {
        setImage("ShoulderPress");
    }


    public String name()
    {
        return "Shoulder Press";
    }


    public Image gif()
    {
        return gif.getImage();
    }


    public int type()
    {
        return 1;
    }

}




// -------------------------------------------------------------------------
/**
 * represents a toes to bar exercise with a gif and region of body.
 *
 * @author Kyle
 * @version Nov 10, 2014
 */
class ToesToBar
    extends RectangleShape
    implements IExercise
{
// ----------------------------------------------------------
    /**
     * Create a new Toes to Bar object.
     */
    public ToesToBar()
    {
        setImage("ToesToBar");
    }


    public String name()
    {
        return "Toes to Bar";
    }


    public Image gif()
    {
        return gif.getImage();
    }


    public int type()
    {
        return 5;
    }

}


//-------------------------------------------------------------------------
/**
* represents a Bicep Curls exercise with a gif and region of body.
*
* @author Kyle
* @version Nov 10, 2014
*/
class BicepCurls
 extends RectangleShape
 implements IExercise
{
//----------------------------------------------------------
 /**
  * Create a new BicepCurls object.
  */
 public BicepCurls()
 {
     setImage("BicepCurls");
 }


 public String name()
 {
     return "Bicep Curls";
 }


 public Image gif()
 {
     return gif.getImage();
 }


 public int type()
 {
     return 3;
 }

}


//-------------------------------------------------------------------------
/**
* represents a Up Right Rows exercise with a gif and region of body.
*
* @author Kyle
* @version Nov 10, 2014
*/
class UpRightRows
extends RectangleShape
implements IExercise
{
//----------------------------------------------------------
/**
* Create a new Up Right Rows object.
*/
public UpRightRows()
{
   setImage("UpRightRows");
}


public String name()
{
   return "Up-Right Rows";
}


public Image gif()
{
   return gif.getImage();
}


public int type()
{
   return 4;
}

}


//-------------------------------------------------------------------------
/**
* represents a Thrusters exercise with a gif and region of body.
*
* @author Kyle
* @version Nov 10, 2014
*/
class Thrusters
extends RectangleShape
implements IExercise
{
//----------------------------------------------------------
/**
* Create a new Thrusters object.
*/
public Thrusters()
{
 setImage("Thrusters");
}


public String name()
{
 return "Thrusters";
}


public Image gif()
{
 return gif.getImage();
}


public int type()
{
 return 6;
}

}
