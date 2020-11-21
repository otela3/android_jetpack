package com.example.practicaroomretrofit.network;

import com.example.practicaroomretrofit.model.PokemonResponse;

import retrofit2.http.GET;
import javax.annotation.Generated;
import io.reactivex.rxjava3.core.Observable;

public interface PokeApiService {


    @GET("pokemon")
    Observable<PokemonResponse> getPokemons();
}
