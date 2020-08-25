package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dashboard")
public class Dashboard extends Persistente{
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "dashboard")
    private List<DashboardActivo> dashboardActivos;

    public Dashboard(){}

    public Dashboard(String nombre){
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public List<DashboardActivo> getDashboardActivos() {
        return dashboardActivos;
    }
}
