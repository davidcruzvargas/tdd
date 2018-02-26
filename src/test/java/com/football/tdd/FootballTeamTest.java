package com.football.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author DACV
 * 
 *         This class contains all the tests that are applicable to a
 *         {@link FootballTeam} class.
 */
public class FootballTeamTest {

	private static final int THREE_GAMES_WON = 3;

	// If you have a self-explained name for your method, then, is not necessary
	// include a Javadoc.
	@Test
	public void constructorShouldSetGamesWon() {

		// In this step (REFACTOR) is really important refactor all the code, even the
		// tests code. Now the test is not using the magic number all over the place, is
		// using the centralized constant of THREE_GAMES_WON

		FootballTeam team = new FootballTeam(THREE_GAMES_WON);

		assertEquals(THREE_GAMES_WON + " games passed to constructor, but " + team.getGamesWon() + " were returned.",
				THREE_GAMES_WON, team.getGamesWon());
	}
}
