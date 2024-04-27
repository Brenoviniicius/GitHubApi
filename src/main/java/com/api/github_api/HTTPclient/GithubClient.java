package com.api.github_api.HTTPclient;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@Repository
public interface GithubClient {
    @GetExchange("/user/repos")
    public List<RepositoryResponse> listRepos(@RequestHeader(value = "Authorization") String token,
                                              @RequestHeader(value = "X-GitHub-Api-Version", defaultValue = "2022-11-28") String apiVersion,
                                              @RequestParam(value = "visibility") String visibility);


}
