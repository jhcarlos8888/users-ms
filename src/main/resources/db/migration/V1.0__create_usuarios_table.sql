
create table public.Usuario(

    id_usuario serial primary key,

    str_nombre varchar (255) NOT NULL,

    str_apellido varchar (255) NOT NULL,

    str_direccion varchar (255) NOT NULL,

    str_pais varchar (255) NOT NULL,

    str_ciudad varchar (255) NOT NULL,

    str_usuario varchar (50) NOT NULL,

    created_at timestamp NOT NULL





);