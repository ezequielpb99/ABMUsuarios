package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "lista_seguimiento_activo")
public class ListaSeguimientoActivo extends Persistente{
    @ManyToOne
    @Column(name = "lista_seguimiento_id")
    private ListaSeguimiento listaSeguimiento;

    @ManyToOne
    @Column(name = "activo_id")
    private Activo activo;

    @Column(columnDefinition = "DATE")
    private LocalDateTime fecha_hora;


    public ListaSeguimientoActivo(){}

    public ListaSeguimientoActivo(ListaSeguimiento listaSeguimiento, Activo activo, LocalDateTime fecha_hora){
        this.listaSeguimiento = listaSeguimiento;
        this.activo = activo;
        this.fecha_hora = fecha_hora;
    }

    public ListaSeguimiento getListaSeguimiento() {
        return listaSeguimiento;
    }

    public Activo getActivo() {
        return activo;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }
}
