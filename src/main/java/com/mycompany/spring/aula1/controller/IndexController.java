/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring.aula1.controller;

import com.mycompany.spring.aula1.entity.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodrigo.teruel
 */
@RestController
public class IndexController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getTexto(){
        return "Olá pessoal!";
    }
    
    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public Usuario getTexto(@PathVariable String nome){
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        
        return usuario;
    }
    
}
