/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.controller;

import com.rincon.gt.efgarcid.common.CommonController;
import com.rincon.gt.efgarcid.models.TareaModel;
import com.rincon.gt.efgarcid.models.UsuarioModel;
import com.rincon.gt.efgarcid.svc.TareaSvc;
import com.rincon.gt.efgarcid.svc.UsuarioSvc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author egarc
 */
@Api
@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController extends CommonController<UsuarioModel, UsuarioSvc>{
    
    @Autowired
    protected UsuarioSvc Service;
    
    @GetMapping("/obtener/usuario/{correo}/{pass}")
    @ApiOperation(value = "Obtener datos por credenciales")
    public Optional<List<UsuarioModel>> obtenerTablerosByUsuario(
            @PathVariable @ApiParam(value = "correo") String correo,
            @PathVariable @ApiParam(value = "pass") String pass,
            @RequestHeader(name = "Accept-Languaje", required = false) Locale locale)
            throws Exception {
        try {
            Optional<List<UsuarioModel>> listaTarea = service.obtenerUsuarioByContrasenia(correo, pass);
            return listaTarea;
        } catch (Exception handlerException) {
            return null;
        }

    }
}
