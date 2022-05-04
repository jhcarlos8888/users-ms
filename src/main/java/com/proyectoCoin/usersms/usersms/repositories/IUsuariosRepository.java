package com.proyectoCoin.usersms.usersms.repositories;


import com.proyectoCoin.usersms.usersms.model.Usuarios;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//se crea una anotacion para poder indicar que esta interface es una repositorio
@Repository

//Se crea una interface para poder interactuar con la base de datos, se pasa como parametro
//la clase Usuarios y el tipo de dato que corresponde a su llave primaria que seria un String
public interface IUsuariosRepository extends CrudRepository<Usuarios, Long> {

    //Metodo para traer una lista de usuario segun el nombre
    //Anotacion para traer de base de datos informacion
    //Se realiza una consulta JPQL
    //SELECT obj FROM Class obj WHERE {{predicados}},
    // los predicados son en base a los atributos de la clase
    //Entonces en la consulta Query se esta diciendo que lo que se le pase como
    //parametro dentro del metodo findByName sera lo que se consultara en la tabla
    // de la base de datos

    /**Algo muy urgente que se tiene que tener en cuenta es que para realizar una busqueda de un campo
     * se tiene que especificar muy bien el nombre del metodo, es decir findByUser es una palabra reservada
     * en donde la ultima palabra User tiene que ser igual como se nombraron los campos de la entidad Usuarios
     */
    @Query( "SELECT objUsuario FROM Usuarios objUsuario WHERE objUsuario.user = :user")
    List<Usuarios> findByUser(String user);


    //Se crea un metodo para buscar un usuario por su nombre
    List<Usuarios> findByNombre(String nombre);

}
