

package com.tienda.domain;




@Data
@Entity
@Table(name= "usuario")



public class Usuario {
@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "id_usuario")
    private Long idUsuario;
    private String username;
    private String password;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String rutaImagen;    
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_usuario")
    List<Rol> roles;
}
