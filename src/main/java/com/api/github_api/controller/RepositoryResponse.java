package com.api.github_api.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponse(String id,
                                 String name,
                                 @JsonProperty("html_url") String htmlUrl,
                                 @JsonProperty("private") boolean isPrivate,
                                 String description) {
}

/** Mapeamento dos atributos que serão retornados na requisição