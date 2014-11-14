package com.GroupProject.reps;


import java.util.LinkedList;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Kyle
 *  @version Nov 13, 2014
 */

public class ExerciseLists
{
    private LinkedList<IExercise> exerciseList;
    private LinkedList<IExercise> shouldersList;
    private LinkedList<IExercise> chestList;
    private LinkedList<IExercise> armsList;
    private LinkedList<IExercise> backList;
    private LinkedList<IExercise> abdominalList;
    private LinkedList<IExercise> legsList;


    // ----------------------------------------------------------
    /**
     * Create a new ExerciseLists object.
     */
    public ExerciseLists()
    {
        exerciseList = new LinkedList<IExercise>();
        //adds all of the exercises to the list
        exerciseList.add(new BenchPress());
        exerciseList.add(new BicepCurls());
        exerciseList.add(new ShoulderPress());
        exerciseList.add(new Thrusters());
        exerciseList.add(new ToesToBar());
        exerciseList.add(new UpRightRows());
        exerciseList.add(new WeightedSquats());

        this.sortLists();
    }
    // ----------------------------------------------------------
    /**
     * sorts the exercises into sorted lists based on the area of the body
     */
    private void sortLists()
    {
        //sorts the exercises into their separate lists based on the body
        //regions
        for (IExercise ex: exerciseList)
        {
            if (ex.type() == 1)
            {
                shouldersList.add(ex);
            }
            else if (ex.type() == 2)
            {
                chestList.add(ex);
            }
            else if (ex.type() == 3)
            {
                armsList.add(ex);
            }
            else if (ex.type() == 4)
            {
                backList.add(ex);
            }
            else if (ex.type() == 5)
            {
                abdominalList.add(ex);
            }
            else
            {
                legsList.add(ex);
            }
        }
    }


 // ----------------------------------------------------------
    /**
     * returns the Exercise list
     * @return the Exercise list
     */
    public LinkedList<IExercise> getExerciseList()
    {
        return exerciseList;
    }


    // ----------------------------------------------------------
    /**
     * returns the shoulders list of exercises
     * @return the shoulders list of exercises
     */
    public LinkedList<IExercise> getShouldersList()
    {
        return shouldersList;
    }

 // ----------------------------------------------------------
    /**
     * returns the chest list of exercises
     * @return the chest list of exercises
     */
    public LinkedList<IExercise> getChestList()
    {
        return chestList;
    }

 // ----------------------------------------------------------
    /**
     * returns the arms list of exercises
     * @return the arms list of exercises
     */
    public LinkedList<IExercise> getArmsList()
    {
        return armsList;
    }

 // ----------------------------------------------------------
    /**
     * returns the back list of exercises
     * @return the back list of exercises
     */
    public LinkedList<IExercise> getBackList()
    {
        return backList;
    }

 // ----------------------------------------------------------
    /**
     * returns the abdominal list of exercises
     * @return the abdominal list of exercises
     */
    public LinkedList<IExercise> getAbdominalList()
    {
        return abdominalList;
    }

 // ----------------------------------------------------------
    /**
     * returns the legs list of exercises
     * @return the legs list of exercises
     */
    public LinkedList<IExercise> getLegsList()
    {
        return legsList;
    }
}
