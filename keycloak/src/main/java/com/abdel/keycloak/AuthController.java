package com.abdel.keycloak;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @GetMapping("/user")
    @PreAuthorize("hasRole('client_user')")
    public String hello() {
        return "Hello from spring boot & keycloak - USER";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String helloAdmin() {
        return "Hello from spring boot & keycloak - ADMIN";
    }
}
