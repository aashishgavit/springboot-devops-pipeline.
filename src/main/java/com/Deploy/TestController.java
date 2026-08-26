package com.Deploy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/testing")
public class TestController {

    @GetMapping
    public ResponseEntity<String> testing() {
        return ResponseEntity.ok("Testing Docker/CICD");
    }
}
