package za.ac.cput.workoutplanapplicationrepo.domain;

import java.io.Serializable;

/**
 *
 */
public class GeneratedWorkoutSchedule implements Serializable {
    private int genNumberOfCycles;
    private int genScheduleID;
    private int genCycleIteration;

    public int getGenNumberOfCycles() {
        return genNumberOfCycles;
    }

    public void setGenNumberOfCycles(int genNumberOfCycles) {
        this.genNumberOfCycles = genNumberOfCycles;
    }

    public int getGenScheduleID() {
        return genScheduleID;
    }

    public void setGenScheduleID(int genScheduleID) {
        this.genScheduleID = genScheduleID;
    }

    public int getGenCycleIteration() {
        return genCycleIteration;
    }

    public void setGenCycleIteration(int genCycleIteration) {
        this.genCycleIteration = genCycleIteration;
    }
}
