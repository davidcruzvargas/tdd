package com.football.tdd;

public class FootballTeam {

	// To fix the code this variable was added and the constructor and the getter
	// now uses this variable to store games won. This is the minimum code to pass
	// the test.
	private int gamesWon;

	public FootballTeam(int gamesWon) {
		this.gamesWon = gamesWon;
	}

	public int getGamesWon() {
		return gamesWon;
	}

}
