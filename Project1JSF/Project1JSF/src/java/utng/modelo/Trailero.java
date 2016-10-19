package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eduardo arias
 */
@Entity @Table(name = "trailero")
public class Trailero implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trailero")
    private long idTrailero;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "tipo_permiso_conducir")
    private String tipoPermisoConducir;

    public Trailero(long idTrilero, String nombre, String apellido, String tipoPermisoConducir) {
        this.idTrailero = idTrilero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoPermisoConducir = tipoPermisoConducir;
    }

    public Trailero() {
        idTrailero = 0L;
    }

    public long getIdTrailero() {
        return idTrailero;
    }

    public void setIdTrailero(long idTrailero) {
        this.idTrailero = idTrailero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoPermisoConducir() {
        return tipoPermisoConducir;
    }

    public void setTipoPermisoConducir(String tipoPermisoConducir) {
        this.tipoPermisoConducir = tipoPermisoConducir;
    }
    
    
}
