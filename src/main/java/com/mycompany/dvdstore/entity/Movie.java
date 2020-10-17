package com.mycompany.dvdstore.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private String titre;
    private String genre ;




    public void registerMovie(Movie movie){
        

    }
    
}
