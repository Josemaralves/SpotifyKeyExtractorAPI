package com.josemar.spotifykeyextractor.service;

import com.josemar.spotifykeyextractor.model.KeyVO;
import reactor.core.publisher.Mono;

public interface KeyService {

    Mono<String> retrieveKey();

}
