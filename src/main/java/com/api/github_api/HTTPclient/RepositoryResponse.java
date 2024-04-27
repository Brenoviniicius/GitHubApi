package com.api.github_api.HTTPclient;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponse(String id,
                                 @JsonProperty("html_url") String htmlUrl,
                                 @JsonProperty("private") boolean isPrivate
                                 ) {
}

/** Mapeamento dos atributos que serão retornados na requisição */