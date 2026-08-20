package com.mantletechsolutions.kafkaeventsproducer.controller;


import com.mantletechsolutions.kafkaeventsproducer.domain.LibraryEvent;
import com.mantletechsolutions.kafkaeventsproducer.domain.LibraryEventType;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LibraryEventsController {



    @PostMapping("/v1/libraryevent")
    public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libraryEvent) {
     log.info("libraryEvent : {}", libraryEvent);
        //invoke kafka producer

        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
    }



}
