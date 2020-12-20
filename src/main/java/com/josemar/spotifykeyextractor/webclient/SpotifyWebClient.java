package com.josemar.spotifykeyextractor.webclient;

import com.josemar.spotifykeyextractor.model.SpotifyTokenVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class SpotifyWebClient {

    @Autowired
    WebClient webClientSpotify;

    public Mono<SpotifyTokenVO> retrieveKey(){
        return  webClientSpotify.get().accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(SpotifyTokenVO.class);
    }
}
