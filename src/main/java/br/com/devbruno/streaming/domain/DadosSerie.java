package br.com.devbruno.streaming.domain;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(@JsonAlias("Title") String title,
                         @JsonAlias("totalSeasons") Integer seasonTotal,
                         @JsonAlias("Year") Integer releaseYear,
                         @JsonAlias("imdbRating") String reviews) {

}
