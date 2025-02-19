package com.vinithius.poke10.api.repository

import com.vinithius.poke10.api.data.*

class PokemonRepositoryData(
    private val repository: PokemonRepository
) {

    suspend fun pokemonList(limit: Int): PokemonListResponse? {
        return repository.getPokemonList(limit).body()
    }

    suspend fun pokemonDetail(id: Int): Pokemon? {
        return repository.getPokemonDetail(id).body()
    }

    suspend fun pokemonEncounters(id: Int): List<Location>? {
        return repository.getPokemonEncounters(id).body()
    }

    suspend fun pokemonEvolution(id: Int): EvolutionChain? {
        return repository.getPokemonEvolution(id).body()
    }

    suspend fun pokemonCharacteristic(id: Int): Characteristic? {
        return repository.getPokemonCharacteristic(id).body()
    }

    suspend fun pokemonSpecies(id: Int): Specie? {
        return repository.getPokemonSpecies(id).body()
    }

    suspend fun pokemonDamageRelations(type: String): Damage? {
        return repository.getPokemonDamageRelations(type).body()
    }
}

