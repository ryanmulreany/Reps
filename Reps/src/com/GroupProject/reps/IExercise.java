package com.GroupProject.reps;

import sofia.graphics.RectangleShape;
import sofia.graphics.Image;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Kyle
 *  @version Nov 9, 2014
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
     * @return name of the work out
     */
    public String name();
    // ----------------------------------------------------------
    /**
     * sets the descriptionLabel to the description of the work out
     * @return the string description of the work out
     */
    public String description();
    // ----------------------------------------------------------
    /**
     * Updates the gif display to the current work out gif
     * @return gif of the work out
     */
    public Image gif();
    // ----------------------------------------------------------
    /**
     * Returns a number which represents the area of the body which this
     * exercise works out.
     * 1 = Shoulders
     * 2 = Chest
     * 3 = Arms
     * 4 = Back
     * 5 = Abdominal
     * 6 = Thighs
     * 7 = Calves
     *
     * @return the number representation of the area being worked out.
     */
    public int type();
}

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Kyle
 *  @version Nov 10, 2014
 */
class Squats extends RectangleShape implements IExercise
{
    // ----------------------------------------------------------
    /**
     * Create a new Squats object.
     */
    public Squats(){}

    public String name()
    {
        return "Squats";
    }

    public String description()
    {
        return "With your back straight and chest out, bend your knees until " +
        		"your thights are horizontal with the ground";
    }

    public Image gif()
    {
        setImage("Squats");
        return gif.getImage();
    }

    public int type()
    {
        return 6;
    }

}