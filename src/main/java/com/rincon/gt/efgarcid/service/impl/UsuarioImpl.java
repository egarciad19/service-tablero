/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.service.impl;

import com.rincon.gt.efgarcid.common.CommonImpl;
import com.rincon.gt.efgarcid.models.TareaModel;
import com.rincon.gt.efgarcid.models.UsuarioModel;
import com.rincon.gt.efgarcid.repository.TareaRepository;
import com.rincon.gt.efgarcid.repository.UsuarioRepository;
import com.rincon.gt.efgarcid.svc.TareaSvc;
import com.rincon.gt.efgarcid.svc.UsuarioSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author egarc
 */
@Service
public class UsuarioImpl extends CommonImpl<UsuarioModel, UsuarioRepository> implements UsuarioSvc{
    
    @Autowired
    protected UsuarioRepository Repository;
    
    @Override
    public Optional<List<UsuarioModel>> obtenerUsuarioByContrasenia(String correoElectronico, String passwordUsuario) throws Exception {
       Optional<List<UsuarioModel>> usuario = Repository.obtenerUsuarioByContrasenia(correoElectronico, passwordUsuario);
       return usuario;
    }
    
}
