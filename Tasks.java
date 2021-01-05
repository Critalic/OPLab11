/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labop10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author START
 */
public class Tasks {
    private Tasks() {}
    
    public static void add(DataBase data,  Actor actor, int whatMovie ) {
        data.allMovies.get(whatMovie-1).addActor(actor.name, actor);
    }
    
    public static void actorWhoDidntPlay (DataBase data ) {
        Set<String> names = new TreeSet<>();
        System.out.println("Actors, who haven't played anywhere yet:");
        for(Iterator<Actor> it = data.allActors.iterator(); it.hasNext();) {
            
            Actor acto= it.next() ;
            if(acto.moviesPlayed.isEmpty()) {
                System.out.println(acto.name);
                names.add(acto.name);
            }
        }
        if(names.isEmpty()) System.out.println("nobody.");
        System.out.println(" ");
    }
    
    public static void actorsFromTheSameMovie (DataBase data, Actor actor) {
        Set names = new TreeSet();
        System.out.println("Actors, who have played together with " + actor.name + ": ");
        for(Iterator it = actor.moviesPlayed.iterator(); it.hasNext();) {
            String titleOfMovie = ((String)it.next()); 
            for (Iterator ite = data.allActors.iterator(); ite.hasNext();) {
                Actor nameOfActor = ((Actor) ite.next());
                for(Iterator iter = nameOfActor.moviesPlayed.iterator(); iter.hasNext();) {
                    if(((String)iter.next()).equals(titleOfMovie) && !(actor.name.equals(nameOfActor.name)) ) { 
                        names.add(nameOfActor.name);
                        System.out.println(nameOfActor.name);
                    }
                }
            }
           
        }
        if(names.isEmpty()) System.out.println("nobody.");
        System.out.println(" ");
        
    }
    
    public static void theMostActorsInAFilm (DataBase data) {
        System.out.println("Moives with the most actors: ");
        ArrayList quantity = new ArrayList();
        for(Movie movie: data.allMovies) {
            quantity.add(movie.actors.size()); 
        }
        Collections.sort(quantity);
        int maxSize = (int) quantity.get((quantity.size() - 1));
        for(Movie movie: data.allMovies) {
            if(movie.actors.size() == maxSize) {
                System.out.println(movie.title);
            }
        }
        
    }
}
