package com.example.myapplication.pokeapi;

import com.example.myapplication.models.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.myapplication.models.PokemonResponse;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonResponse> obtainListPokemon(@Query("limit") int limit, @Query("offset") int offset);

}
