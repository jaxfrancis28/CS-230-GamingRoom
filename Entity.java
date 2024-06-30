package com.gamingroom;

public class Entity {
	//Private attributes
	private long id;
	private String name;
	
	//Default cinstructor
	private Entity() {
	}
	
	//Custom constructor with id & name params
	public Entity(long id, String name) {
		this(); //Call default constructor
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}

	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
}
