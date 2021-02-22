package com.example.caching.jedis.controller;

import com.example.caching.jedis.service.CachingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CachingController {

    private static final Logger logger = LoggerFactory.getLogger(CachingController.class);

    @Autowired
    private CachingService cachingService;

    @GetMapping("/get")
    public ResponseEntity<String> get() {
        String val = cachingService.get();
        return ResponseEntity.ok(val);
    }

    @GetMapping("/save")
    public ResponseEntity<String> save() {
        cachingService.save();
        return ResponseEntity.ok("Success");
    }
}
