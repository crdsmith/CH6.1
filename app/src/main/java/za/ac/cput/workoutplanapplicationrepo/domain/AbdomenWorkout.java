package za.ac.cput.workoutplanapplicationrepo.domain;

import java.io.Serializable;

/**
 *
 */
public class AbdomenWorkout implements Serializable {
    private String absWName;
    private int absWID;
    private String absWInfo;
    private String absWHint;
    private String absWTarget;

    public String getAbsWName() {
        return absWName;
    }

    public void setAbsWName(String absWName) {
        this.absWName = absWName;
    }

    public int getAbsWID() {
        return absWID;
    }

    public void setAbsWID(int absWID) {
        this.absWID = absWID;
    }

    public String getAbsWInfo() {
        return absWInfo;
    }

    public void setAbsWInfo(String absWInfo) {
        this.absWInfo = absWInfo;
    }

    public String getAbsWHint() {
        return absWHint;
    }

    public void setAbsWHint(String absWHint) {
        this.absWHint = absWHint;
    }

    public String getAbsWTarget() {
        return absWTarget;
    }

    public void setAbsWTarget(String absWTarget) {
        this.absWTarget = absWTarget;
    }
}
