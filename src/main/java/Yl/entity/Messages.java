package Yl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Ying on 5/23/16.
 */
@Entity
public class Messages {
    @Id
    @GeneratedValue
    private int id;

    private int seed;

    private int missionId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeed() {
        return seed;
    }

    public void setName(int seed) {
        this.seed = seed;
    }

    public int getSurname() {
        return missionId;
    }

    public void setSurname(int missionId ) {
        this.missionId = missionId;
    }
}
