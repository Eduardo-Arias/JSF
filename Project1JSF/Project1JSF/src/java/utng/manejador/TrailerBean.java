package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.TrailerDAO;
import utng.datos.TraileroDAO;
import utng.modelo.Trailer;
import utng.modelo.Trailero;
/**
 *
 * @author eduardo arias
 */
@ManagedBean(name = "trailerBean")
@SessionScoped
public class TrailerBean implements Serializable{
    private List<Trailer> trailes;
    private Trailer trailer;
    private List<Trailero> traileros;

    public TrailerBean() {
        trailer = new Trailer();
        trailer.setTrailero(new Trailero());
    }
    
    public List<Trailero> getTraileros() {
        return traileros;
    }

    public void setTraileros(List<Trailero> traileros) {
        this.traileros = traileros;
    }

    public List<Trailer> getTrailes() {
        return trailes;
    }

    public void setTrailes(List<Trailer> trailes) {
        this.trailes = trailes;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
    
    public String listar(){
        TrailerDAO dao = new TrailerDAO();
        try {
            trailes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Trailes";
    }
    public String eliminar(){
        TrailerDAO dao = new TrailerDAO();
        try {
            dao.delete(trailer);
            trailes = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    
    public String iniciar(){
        trailer= new Trailer();
        trailer.setTrailero(new Trailero());
        try {
        traileros = new TraileroDAO().getAll();    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return "Iniciar";
    }
    
    public String guardar(){
        TrailerDAO dao = new TrailerDAO();
        try {
            if(trailer.getIdTrailer()!=0){
                dao.update(trailer);
            }else{
                dao.insert(trailer);
            }
            trailes= dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Trailer trailer){
        this.trailer = trailer;
        try {
            traileros = new TraileroDAO().getAll();
        } catch (Exception e) {
        }
        return "Editar";
    }
}
