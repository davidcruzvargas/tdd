package com.football.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FootballTeamTest {

	@Test
	public void constructorShouldSetGamesWon() {
		FootballTeam team = new FootballTeam(3);

		// Remember always improve your error messages until the message be clear enough
		// to detect the error.
		assertEquals("3 games passed to constructor, but " + team.getGamesWon() + " were returned.", 3,
				team.getGamesWon());

		// This test is passing, and, in this step (GREEN), is a good thing.
	}
}
