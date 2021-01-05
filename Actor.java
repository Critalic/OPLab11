/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labop10;


import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author START
 */
public class Actor implements Comparable<Actor>{

    String name;
    Set <String> moviesPlayed;

    public Actor(String name) {
        this.name = name;
        this.moviesPlayed = new TreeSet<>();

    }

    public void addMovie(String movie) {
        moviesPlayed.add(movie);

    }

    @Override
    public String toString() {
        return "Actor/actress " + name + " has played in" + moviesPlayed;
    }

    @Override
    public int compareTo(Actor o) { 
        return this.name.compareTo(o.name);
    }

}
