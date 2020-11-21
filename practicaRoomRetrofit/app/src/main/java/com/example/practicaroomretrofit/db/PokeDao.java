package com.example.practicaroomretrofit.db;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.practicaroomretrofit.model.Pokemon;

import java.util.List;

public interface PokeDao {

    @Insert
    void insertPokemon(Pokemon pokemon);

    @Query("DELETE FROM favorite_list WHERE name = :pokemonName")
    void deletePokemon(String pokemonName);

    @Query("DELETE FROM favorite_list")
    void deletaAll();

    @Query("SELECT * FROM favorite_list")
    LiveData<List<Pokemon>> getFavoritePokemons();
}
