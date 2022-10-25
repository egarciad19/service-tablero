/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.repository;

import com.rincon.gt.efgarcid.models.TareaModel;
import com.rincon.gt.efgarcid.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author egarc
 */
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Object>{
    
}
