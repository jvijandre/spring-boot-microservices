package com.personal.app.functions.controller;

import com.personal.app.functions.dto.request.CollectionRequest;
import com.personal.app.functions.dto.response.CollectionResponse;
import com.personal.app.functions.service.CollectionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Log4j2
public class MainController {

    private final CollectionService collectionService;

    @PostMapping("/collection/filterBy")
    @ResponseStatus(HttpStatus.OK)
    public CollectionResponse filterBy(@RequestBody @Validated CollectionRequest request) {
        log.info("--- Start filterBy ---");
        try {
            collectionService.filterBy(request);
            return null;
        } finally {
            log.info("--- End filterBy ---");
        }

    }
}
