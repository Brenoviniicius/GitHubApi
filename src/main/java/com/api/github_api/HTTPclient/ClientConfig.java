package com.api.github_api.HTTPclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class ClientConfig {
    @Bean
    public HttpServiceProxyFactory httpServiceProxyFactory() {
        WebClient webClient = WebClient.builder().baseUrl("https://api.github.com").build();
        return HttpServiceProxyFactory.builderFor(WebClientAdapter.create(webClient)).build();
    }

    @Bean
    public GithubClient githubClient(HttpServiceProxyFactory proxyFactory) {
       return proxyFactory.createClient(GithubClient.class);
    }
}
