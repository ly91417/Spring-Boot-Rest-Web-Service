package pl.dmichalski.entity.request;

/**
 * Created by Ying on 5/23/16.
 */
public class AddUserRequest {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
