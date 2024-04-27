package com.api.github_api.controller;

import com.api.github_api.HTTPclient.GithubClient;
import com.api.github_api.HTTPclient.RepositoryResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class GithubController {

    private final GithubClient githubClient;

    public GithubController(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    @GetMapping(value = "/repos")
    public ResponseEntity<List<RepositoryResponse>> listRepos(@RequestHeader("token") String token,@RequestParam(value = "visibility", defaultValue = "public") String visibility) {
        var repos = githubClient.listRepos(
                "Bearer" + token,
                null,
                "public");
        return ResponseEntity.ok(repos);
    }
}


/**Mapeamento do controller da aplicação */