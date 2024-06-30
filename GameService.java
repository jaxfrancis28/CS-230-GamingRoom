package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	
	private static long nextPlayerId = 1;
	
	private static long nextTeamId = 1;
	
	private static GameService service;
	
	private GameService() {
	}
	
	
	public static GameService getInstance() {
		if (service == null) {
			service = new GameService();
			System.out.println("New Game Service created.");
		}
		else {
			System.out.println("Game Service already instantiated.");
		}
		return service;
	}
	
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;
		
		Iterator<Game>gamesIterator = games.iterator();
		
		while(gamesIterator.hasNext()) {
			Game gameInstance = gamesIterator.next();
			
			if(gameInstance.getName().equalsIgnoreCase(name)) {
				return gameInstance;
			}
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	public Game getGame(long id) {
		Game game = null;
		
		Iterator<Game>gameIterator = games.iterator();
		
		while (gameIterator.hasNext()) {
			
			Game gameInstance = gameIterator.next();
			
			if(gameInstance.getId()==id) {
				
				return gameInstance;
			}
		}
		
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
			
			return game;
		
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {
		//Use iterator to look for a existing game with the same id for game (Game game : games)
		Game game = null;
		
		Iterator<Game>gamesIterator = games.iterator();
		
		while(gameIterator.hasNext()) {
			Game gameInstance = gamesIterator.next();
			
			if (gameInstance.getName().equalsIgnoreCase(name)) {
				game = gameInstance;
			}
		}
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {
		Game game = null
				Iterator<Game>gamesIterator = games.iterator();
		while (gamesIterator.hasNext()) {
			Game gameInstance = gameIterator.next();
			
			if(gameInstance.getName().equalsIgnoreCase(name()){
				game = gameInstance;
			}
		}
		return game;
			}
	public int getGameCount() {
		return games.size();
	}
	
	public long getNextPlayerId() {
		return nextPlayerId;
	}
	
	public long getNextTeamId() {
	}
	}
