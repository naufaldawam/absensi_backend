package co.id.absens.main_service.controllers.login_controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.id.absens.main_service.payloads.response.Response;

@RestController
@RequestMapping("/login")
public class LoginControllers {

    @PostMapping
    public ResponseEntity<?> masterDataProvinsi() {
        Response response = new Response();

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(response);
    }
}
