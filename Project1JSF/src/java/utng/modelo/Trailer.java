package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author eduardo arias
 */
@Entity
@Table(name = "trailer")
public class Trailer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trailer")
    private Long idTrailer;

    @Column(name = "nombre_compania")
    private String nombreCompania;

    @Column(name = "numero_vagones")
    private int numeroVagones;

    @Column(name = "tipo_carga")
    private String tipoCarga;

    @ManyToOne()
    @JoinColumn(name = "id_trailero")
    private Trailero trailero;
    
    @ManyToOne()
    @JoinColumn(name = "id_rol_fk")
    private Rol rol;

    public Trailer(Long idTrailer, String nombreCompania, int numeroVagones, String tipoCarga, Trailero trailero, Rol rol) {
        this.idTrailer = idTrailer;
        this.nombreCompania = nombreCompania;
        this.numeroVagones = numeroVagones;
        this.tipoCarga = tipoCarga;
        this.trailero = trailero;
        this.rol = rol;
    }

    public Trailer() {
        idTrailer = 0L;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Long getIdTrailer() {
        return idTrailer;
    }

    public void setIdTrailer(Long idTrailer) {
        this.idTrailer = idTrailer;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public int getNumeroVagones() {
        return numeroVagones;
    }

    public void setNumeroVagones(int numeroVagones) {
        this.numeroVagones = numeroVagones;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public Trailero getTrailero() {
        return trailero;
    }

    public void setTrailero(Trailero trailero) {
        this.trailero = trailero;
    }

}
