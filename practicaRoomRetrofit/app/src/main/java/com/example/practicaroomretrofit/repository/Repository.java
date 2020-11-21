package com.example.practicaroomretrofit.repository;

import androidx.lifecycle.LiveData;

import com.example.practicaroomretrofit.db.PokeDao;
import com.example.practicaroomretrofit.model.Pokemon;
import com.example.practicaroomretrofit.model.PokemonResponse;
import com.example.practicaroomretrofit.network.PokeApiService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;

public class Repository {
    private PokeDao pokeDao;
    private PokeApiService apiService;

    @Inject
    public Repository(PokeDao pokeDao, PokeApiService apiService) {
        this.pokeDao = pokeDao;
        this.apiService = apiService;
    }

    public Observable<PokemonResponse> getPokemons() {
        return apiService.getPokemons();
    }


    public void insertPokemon(Pokemon pokemon) {
        pokeDao.insertPokemon(pokemon);
    }

    public void deletePokemon(String pokemonName) {
        pokeDao.deletePokemon(pokemonName);
    }

    public void deleteAll(){
        pokeDao.deletaAll();
    }

    public LiveData<List<Pokemon>> getFavoritePokemon(){
        return pokeDao.getFavoritePokemons();
    }

}