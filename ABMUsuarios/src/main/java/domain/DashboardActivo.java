package domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dashboard_activo")
public class DashboardActivo extends Persistente {
    @ManyToOne
    @Column(name = "dashboard_id")
    private Dashboard dashboard;

    @ManyToOne
    @Column(name = "activo_id")
    private Activo activo;

    @Column(columnDefinition = "DATE")
    private LocalDateTime fecha_hora;

    public DashboardActivo(){}

    public DashboardActivo(Dashboard dashboard, Activo activo, LocalDateTime fecha_hora){
        this.dashboard = dashboard;
        this.activo = activo;
        this.fecha_hora = fecha_hora;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public Activo getActivo() {
        return activo;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }
}
