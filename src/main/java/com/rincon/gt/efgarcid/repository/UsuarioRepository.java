/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.repository;

import com.rincon.gt.efgarcid.models.TareaModel;
import com.rincon.gt.efgarcid.models.UsuarioModel;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author egarc
 */
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Object> {

    @Query(value = "select * from bd_proyecto.bd_usuario bu where \n"
            + "bu.correo_electronico = :correoElectronico and bu.password_usuario = :passwordUsuario",
            nativeQuery = true)
    Optional<List<UsuarioModel>> obtenerUsuarioByContrasenia(@Param("correoElectronico") String correoElectronico,
            @Param("passwordUsuario") String passwordUsuario);
}
