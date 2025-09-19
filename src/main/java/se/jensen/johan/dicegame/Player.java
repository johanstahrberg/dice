package se.jensen.johan.dicegame;


public class Player {

    private String firstname;
    private String lastname;
    private int score;


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getScore() {
        return score;
    }


    public Player(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.score = 0;
    }


    public String getFullName() {
        return this.firstname + " " + this.lastname;

    }


    public void addScore(int score) {
        this.score += score;

    }


}