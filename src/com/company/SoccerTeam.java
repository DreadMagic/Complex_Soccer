package com.company;
public class SoccerTeam {
    private int wins, losses, ties;
    private static int gamesPlayed, goalsScored;

    public void played(SoccerTeam other, int myGoals, int otherGoals){
        gamesPlayed++;
        goalsScored+= myGoals + otherGoals;

        if(myGoals>otherGoals){
            wins++;
            other.losses++;
        }
        else if(myGoals<otherGoals){
            losses++;
            other.wins++;
        }
        else if(myGoals==otherGoals){
            ties++;
            other.ties++;
        }
    }

    public void reset(){
        wins=0;
        losses=0;
        ties=0;
    }

    public static void StartTournament(){
        goalsScored = 0;
        gamesPlayed = 0;
    }

    public static void main(String[] args) {
        SoccerTeam airheads = new SoccerTeam();
        SoccerTeam kitkat = new SoccerTeam();
        SoccerTeam snickers = new SoccerTeam();
        SoccerTeam twix = new SoccerTeam();

    }
}
