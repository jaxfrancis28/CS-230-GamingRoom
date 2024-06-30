package com.gamingroom;

import java.util.ArryList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {
	private List<Team>teams = new
			ArryList<Team>();
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
	}

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
	}

	
	public Team addTeam(String name) {
		Team team = null;
		Itertor<Team> teamsIterator = teams.iterator();
		while (teamsIterator.hasNext()) {
			Team teamInstance = teamsIterator.next();
			if (teamInstance.getName().equalsIgnoreCase(name)) {
				team = teamInstance;
			}
			else {
				teams.add(team);
			
			}
		}
		
		return team;
	
		
	}

	@Override
	public String toString() {
		
		return "Game [id=" + auper.getId() + ", name=" + super.getName() + "]";
	}

}
