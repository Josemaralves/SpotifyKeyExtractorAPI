package com.josemar.spotifykeyextractor.resource;

import com.josemar.spotifykeyextractor.model.SpotifyTokenVO;
import com.josemar.spotifykeyextractor.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/key")
public class KeyResource {

    @Autowired
    KeyService keyService;

    @GetMapping
    public Mono<SpotifyTokenVO> getKey(){
        return keyService.retrieveKey();
    }

}
