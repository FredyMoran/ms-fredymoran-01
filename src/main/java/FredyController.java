package com.file.ms_fredymoran_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FredyController {

    @GetMapping("/")
    public String getMsFredymoran() {
        return "Hola Fredy Moran!";
    }
}
