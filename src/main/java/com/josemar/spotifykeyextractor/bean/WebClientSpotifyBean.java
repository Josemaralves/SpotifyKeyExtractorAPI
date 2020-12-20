package com.josemar.spotifykeyextractor.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebClientSpotifyBean {

    private static final String SPOTIFY_URL = "https://open.spotify.com/get_access_token";

    @Bean
    public WebClient webClientSpotify(WebClient.Builder builder){
        return builder.
                baseUrl(SPOTIFY_URL).
                build();
    }

}
