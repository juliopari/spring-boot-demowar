package com.juliopari.demowar.controller;

import com.juliopari.demowar.dto.TramaMensaje;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola mundo";
    }
    
    @GetMapping("/hola2")
    public TramaMensaje hola2() {
        TramaMensaje tramaMensaje = new TramaMensaje();        
        tramaMensaje.setMensaje("Hola mensaje 2");        
        return tramaMensaje;
    }
    
    @GetMapping("/hola3/{id}")
    public TramaMensaje hola3(@PathVariable Long id) {
        TramaMensaje tramaMensaje = new TramaMensaje();        
        tramaMensaje.setMensaje("Hola mensaje con parametro: " + id);        
        return tramaMensaje;
    }
    
    @GetMapping("/hola4")
    public List<TramaMensaje> hola4() {
        List mensajes = new ArrayList<TramaMensaje>();
          
        for (int i = 0; i < 10; i++) {
            TramaMensaje tramaMensaje = new TramaMensaje(); 
            tramaMensaje.setMensaje("Mensaje " + i);
            mensajes.add(tramaMensaje);
        }
        
        return mensajes;
    }
    
}
