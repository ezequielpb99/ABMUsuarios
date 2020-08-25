package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario extends Persistente{
    @Column
    private String auth0_id;
    @Column
    private String nombre_usuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private List<ListaSeguimiento> listasDeSeguimiento;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Dashboard dashboard;



    public Usuario(){}

    public Usuario(String nombre, String apellido, String nombre_usuario){
        this.apellido = apellido;
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
    }


    public String getAuth0_id() {
        return auth0_id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public List<ListaSeguimiento> getListasDeSeguimiento() {
        return listasDeSeguimiento;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }
}
