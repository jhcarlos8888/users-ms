package com.proyectoCoin.usersms.usersms.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;




//Se asocia como una entidad
@Entity

//Se asocia como una tabla
@Table(name = "Usuario")


//Se crea modelo de tabla Usuario proyecto coin
public class Usuarios implements Serializable {

    //Se relaciona el campo como un ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Se coloca el nombre tal cual esta en la base de datos
    @Column(name = "id_usuario")
    //Campo id
    private Long id;
    @Column(name = "str_nombre")
    private String nombre;

    @Column(name = "str_apellido")
    private String apellido;

    @Column(name = "str_direccion")
    private String direccion;

    @Column(name = "str_pais")
    private String pais;

    @Column(name = "str_ciudad")
    private String ciudad;


    @Column(name = "str_usuario")
    private String user;

    //Columna para guardar las fechas en que se crean y modifican las tablas
    //de bases de datos en el codigo
    @Column(name = "created_at")

    private Date createdAt;



    //Se crea constructor de clase
    public Usuarios() {
    }

    //Constructor con todos sus atributos


    public Usuarios(Long id, String nombre, String apellido, String direccion, String pais, String ciudad, String user, Date createdAt) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.pais = pais;
        this.ciudad = ciudad;
        this.user = user;
        this.createdAt = createdAt;
    }

    /*** Se generan los getters and Setters */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /***Fin getters and Setters*/



}
