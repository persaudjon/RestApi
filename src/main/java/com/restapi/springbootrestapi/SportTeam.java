package com.restapi.springbootrestapi;

public class SportTeam {
    private String teamName;
    private int wins;
    private int losses;
    public SportTeam(String teamName, int wins, int losses ){
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getLosses() {
        return losses;
    }

    public int getWins() {
        return wins;
    }
}
