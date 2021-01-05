/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labop10;

import java.util.ArrayList;

/**
 *
 * @author START
 */
public class DataBase {
    ArrayList<Movie> allMovies;
    ArrayList<Actor> allActors;

    public DataBase() {
        this.allMovies = new ArrayList<>();
        this.allActors = new ArrayList<>();
    }
    
    public void addMovieToDataBase (Movie movie) {
        
        allMovies.add(movie);
    }
    
    public void addActorToDataBase (Actor actor) {  
        
        allActors.add(actor);
        
    }
    
 }
