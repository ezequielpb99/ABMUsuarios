package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "activo")
public class Activo extends Persistente {
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "ticker")
    private String ticker;
    @Column(name = "descripcion")
    private String descripcion;

    public Activo(){}

    public Activo(String tipo, String ticker, String descripcion){
        this.tipo = tipo;
        this.ticker = ticker;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTicker() {
        return ticker;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
