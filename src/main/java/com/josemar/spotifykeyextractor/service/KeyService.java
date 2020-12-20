package com.josemar.spotifykeyextractor.service;

import com.josemar.spotifykeyextractor.model.SpotifyTokenVO;
import reactor.core.publisher.Mono;

public interface KeyService {

    Mono<SpotifyTokenVO> retrieveKey();

}
