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

        airheads.played(kitkat,5,7);
        airheads.played(snickers,4,2);
        kitkat.played(twix,8,7);
        snickers.played(twix,6,1);

        System.out.println(airheads.wins*3+airheads.ties*1);
        System.out.println(kitkat.wins*3+kitkat.ties*1);
        System.out.println(snickers.wins*3+snickers.ties*1);
        System.out.println(twix.wins*3+twix.ties*1);

        System.out.println(gamesPlayed);
        System.out.println(goalsScored);

        StartTournament();
            airheads.reset();
            kitkat.reset();
            snickers.reset();
            twix.reset();

        airheads.played(kitkat,0,2);
        airheads.played(snickers,2,0);
        kitkat.played(twix,4,1);
        snickers.played(twix,1,1);

        System.out.println(airheads.wins*3+airheads.ties*1);
        System.out.println(kitkat.wins*3+kitkat.ties*1);
        System.out.println(snickers.wins*3+snickers.ties*1);
        System.out.println(twix.wins*3+twix.ties*1);

        System.out.println(gamesPlayed);
        System.out.println(goalsScored);
    }
}

//3 airheads
//6 kitkats
//3 snickers
//0 twix

//4 games
//40 goals

//New Tourney
//3 airheads
//6 kitkats
//1 snickers
//1 twix

//4 games
//11 goals