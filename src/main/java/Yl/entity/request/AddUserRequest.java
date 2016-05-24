package Yl.entity.request;

/**
 * Created by Ying on 5/23/16.
 */
public class AddUserRequest {
    private int missionId;
    private int seed;

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }
}
