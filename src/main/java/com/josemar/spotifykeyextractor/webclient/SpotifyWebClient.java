package com.josemar.spotifykeyextractor.webclient;

import com.josemar.spotifykeyextractor.model.KeyVO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class SpotifyWebClient {

    public Mono<String> retrieveKey(){
        WebClient webClient = WebClient.builder()
                .baseUrl("https://open.spotify.com/get_access_token").build();

        return webClient.get().accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);


        //return webClient.get().accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(KeyVO.class);
    }
}
