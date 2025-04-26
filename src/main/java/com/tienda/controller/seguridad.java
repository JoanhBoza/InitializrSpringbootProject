

package com.tienda.controller;


public class seguridad {
@GetMapping("/publico/hola")
    @ResponseBody
    public String holaPublico() {
        return "¡Hola, visitante!";
    }

    @GetMapping("/inicio")
    @ResponseBody
    public String inicioProtegido() {
        return "Bienvenido, estás autenticado.";
    }

    @GetMapping("/login")
    public String loginPersonalizado() {
        return "login";  
    }
}

