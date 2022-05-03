package com.proyectoCoin.usersms.usersms.services;

import com.proyectoCoin.usersms.usersms.model.Usuarios;
import com.proyectoCoin.usersms.usersms.repositories.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//Anotacion para relacionar la clase como un servicio
@Service
public class UsuarioService {

    //Anotacion para injectar esta clase de los metodos y atributos de la interface IUsuariosRepository
    @Autowired
    //Se crea atributo para manipular la interface
    private IUsuariosRepository iUsuariosRepository;

    /**
     * Crear usuario
     * y verificar que no este repetido
     * @param usuario
     */
    public void createUsuario(Usuarios usuario){

        //Se crea un objeto lista para buscar un usuario por su nombre donde se llamara a el repositorio
        //y se le pasara como parametro el nombre que se entrego en el metodo createUsuario
        List<Usuarios>  usuariosByUsuario = iUsuariosRepository.findByUsuario(usuario.getUsuario());

        //se crea entonces una condicional en donde si la lista usuariosByName no obtuvo algun dato
        //es decir si la lista NO esta vacia entonces significa que ese usuario no existe
        //y se dispara una exception
        if(!usuariosByUsuario.isEmpty()){

            throw new RuntimeException("El  usuario ya existe");

        }
        //Si la lista si esta vacia entonces se procede a crear el usuario
        iUsuariosRepository.save(usuario);

    }

    /**
     * Metodo para obtener un listado de usuarios segun el nombre entregado
     * @param nombre
     * @return Se retorna una lista de usuarios  segun la coincidencia de nombres
     */
    public List<Usuarios> getByNombre(String nombre){

        return iUsuariosRepository.findByName(nombre);

    }

}
