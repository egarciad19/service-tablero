/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author egarc
 */
@Entity
@DynamicUpdate
@Table(name = "bd_usuario",
         schema = "bd_proyecto"
)
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_usuario")
    private Integer codigoUsuario;
    
    @Column(name = "estado")
    private Integer estado;
    
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    
    @Column(name = "password_usuario")
    private String passwordUsuario;
    
    @Column(name = "correo_electronico")
    private String correoElectronico;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "usuario_adiciono")
    private String usuarioAdiciono;
    
    @Column(name = "fecha_adiciono")
    private Date fechaAdiciono;
    
    @Column(name = "usuario_modifico")
    private String usuarioModifico;
    
    @Column(name = "fecha_modifico")
    private Date fechaModifico;

    public UsuarioModel() {
    }

    public UsuarioModel(Integer codigoUsuario, Integer estado, String nombreUsuario, String passwordUsuario, String correoElectronico, String direccion, String usuarioAdiciono, Date fechaAdiciono, String usuarioModifico, Date fechaModifico) {
        this.codigoUsuario = codigoUsuario;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.usuarioAdiciono = usuarioAdiciono;
        this.fechaAdiciono = fechaAdiciono;
        this.usuarioModifico = usuarioModifico;
        this.fechaModifico = fechaModifico;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuarioAdiciono() {
        return usuarioAdiciono;
    }

    public void setUsuarioAdiciono(String usuarioAdiciono) {
        this.usuarioAdiciono = usuarioAdiciono;
    }

    public Date getFechaAdiciono() {
        return fechaAdiciono;
    }

    public void setFechaAdiciono(Date fechaAdiciono) {
        this.fechaAdiciono = fechaAdiciono;
    }

    public String getUsuarioModifico() {
        return usuarioModifico;
    }

    public void setUsuarioModifico(String usuarioModifico) {
        this.usuarioModifico = usuarioModifico;
    }

    public Date getFechaModifico() {
        return fechaModifico;
    }

    public void setFechaModifico(Date fechaModifico) {
        this.fechaModifico = fechaModifico;
    }
    
    
}
