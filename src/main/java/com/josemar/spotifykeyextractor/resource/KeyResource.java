package com.josemar.spotifykeyextractor.resource;

import com.josemar.spotifykeyextractor.model.KeyVO;
import com.josemar.spotifykeyextractor.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/key")
public class KeyResource {

    @Autowired
    KeyService keyService;

    @GetMapping
    public Mono<String> getKey(){
        return keyService.retrieveKey();
    }

}
