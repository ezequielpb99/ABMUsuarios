package domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "lista_seguimiento")
public class ListaSeguimiento extends Persistente{
    @Column(name = "nombre")
    private String nombre;
    @Column(columnDefinition = "DATE")
    private LocalDateTime fecha_hora;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "dashboard")
    private List<ListaSeguimientoActivo> listaSeguimientoActivos;


    public ListaSeguimiento(){}

    public ListaSeguimiento(String nombre, LocalDateTime fecha_hora){
        this.nombre = nombre;
        this.fecha_hora = fecha_hora;
    }


    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public List<ListaSeguimientoActivo> getListaSeguimientoActivos() {
        return listaSeguimientoActivos;
    }
}
