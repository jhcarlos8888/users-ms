package com.proyectoCoin.usersms.usersms.repositories;


import com.proyectoCoin.usersms.usersms.model.Usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//se crea una anotacion para poder indicar que esta interface es una repositorio
@Repository

//Se crea una interface para poder interactuar con la base de datos, se pasa como parametro
//la clase Usuarios y el tipo de dato que corresponde a su llave primaria que seria un String
public interface IUsuariosRepository extends CrudRepository<Usuarios, String> {

    //Metodo para traer una lista de usuario segun el nombre
    List<Usuarios> findByName(String nombre);

}
