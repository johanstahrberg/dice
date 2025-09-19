package se.jensen.johan.dicegame;


public class Player {

    private String firstname;

    public Player(int score) {
        this.score = 0;
    }


    public int getScore() {
        return score;
    }

    private int score;
    private String lastname;

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }


    public Player(String firstname, String lastname) {
        this.firstname = firstname;

        this.lastname = lastname;
    }


    public void getFullName() {
        System.out.println(this.firstname + " " + this.lastname);

    }


    public void addScore(int score) {
        this.score += score;

    }


}