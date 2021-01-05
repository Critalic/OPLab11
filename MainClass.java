/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labop10;

import java.util.ArrayList;
import com.mycompany.labop10.Tasks;
import java.util.Iterator;

/**
 *
 * @author START
 */
public class MainClass {

    public static void main(String[] args) {

        DataBase data = new DataBase();
        //all the actors
        ArrayList<String> actors = new ArrayList<>();
        actors.add("John");
        actors.add("Chris");
        actors.add("Julie");
        actors.add("Sabine");
        //all the movies
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Dune");
        movies.add("Star Wars");
        movies.add("Lord of the Rings");
        movies.add("Check");

        // declare objects for all actors and add them in the list in DataBase
        for (int i = 0; i < actors.size(); i++) {
            Actor actor = new Actor(actors.get(i));
            data.addActorToDataBase(actor);
        }
        // declare objects for all movies and add them in the list in DataBase
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = new Movie(movies.get(i));
            data.addMovieToDataBase(movie);
        }
        // ADD actors to movies like this: Tasks.add(data,  data.allActors.get(0) ->actor, 1 ->movie);
        Tasks.add(data, data.allActors.get(0), 1);
        Tasks.add(data, data.allActors.get(2), 1);

        Tasks.add(data, data.allActors.get(0), 2);
        Tasks.add(data, data.allActors.get(3), 2);

        Tasks.add(data, data.allActors.get(2), 3);
        
        Tasks.add(data, data.allActors.get(0), 4);
        Tasks.add(data, data.allActors.get(1), 4);
        Tasks.add(data, data.allActors.get(2), 4);
        Tasks.add(data, data.allActors.get(3), 4);

        // perform tasks
        for(Iterator it = data.allActors.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        for(Iterator it = data.allMovies.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        
        

    }
}
