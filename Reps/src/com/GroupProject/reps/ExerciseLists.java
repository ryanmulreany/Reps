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
    private LinkedList<LinkedList> orderedExerciseList;


    // ----------------------------------------------------------
    /**
     * Create a new ExerciseLists object.
     */
    public ExerciseLists()
    {
        exerciseList = new LinkedList<IExercise>();
        exerciseList.add(new WeightSquats());
        exerciseList.add(new BenchPress());
    }
    // ----------------------------------------------------------
    /**
     * sorts the exercises into sorted lists based on the area of the body
     */
    public void sortLists()
    {
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
        orderedExerciseList = new LinkedList<LinkedList>();
        orderedExerciseList.add(shouldersList);
        orderedExerciseList.add(chestList);
        orderedExerciseList.add(armsList);
        orderedExerciseList.add(backList);
        orderedExerciseList.add(abdominalList);
        orderedExerciseList.add(legsList);

    }




}
