package com.proyectoCoin.usersms.usersms.controllers;


import com.proyectoCoin.usersms.usersms.model.Usuarios;
import com.proyectoCoin.usersms.usersms.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Anotacion para definir esta clase como un controlador para la api
@RestController

@RequestMapping("/usuarios")
public class UsuariosController {

    //anotacion para injectarle a esta clase los metodos correspondientes de la clase UsuarioService
    @Autowired
    //Atributo para manipular clase UsuarioService
    private UsuarioService usuarioService;


    /***Metodo crear un nuevo usuario */
    @PostMapping
    public void create(@RequestBody Usuarios usuario){
        usuarioService.createUsuario(usuario);
    }


    /**
     * Metodo para obtener usuarios segun la similitud del nombre
     * GET /usuarios?nombre={{nombre}}
     * @param nombre
     * @return
     */
    @GetMapping
    public List<Usuarios> getUsuariosByNombre(@RequestParam(name = "nombre") String nombre){

        return usuarioService.getByNombre(nombre);

    }



    /**
     * Segundo Metodo para obtener usuarios segun la similitud del nombre
     * GET /usuarios/by-nombre
     * @param nombre
     * @return
     * */

    @GetMapping("by-nombre")
    public List<Usuarios> getUsuariosByNombre2(@RequestParam(name = "nombre") String nombre){

        return usuarioService.getByNombre(nombre);

    }



}
