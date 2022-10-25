/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.service.impl;

import com.rincon.gt.efgarcid.common.CommonImpl;
import com.rincon.gt.efgarcid.models.CatalogoModel;
import com.rincon.gt.efgarcid.models.UsuarioModel;
import com.rincon.gt.efgarcid.repository.CatologoRepository;
import com.rincon.gt.efgarcid.repository.UsuarioRepository;
import com.rincon.gt.efgarcid.svc.CatologoSvc;
import com.rincon.gt.efgarcid.svc.UsuarioSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author egarc
 */
@Service
public class CatalogoImp extends CommonImpl<CatalogoModel, CatologoRepository> implements CatologoSvc{
    
}
