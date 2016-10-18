package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.TraileroDAO;
import utng.modelo.Trailero;
/**
 *
 * @author eduardo
 */
@ManagedBean//(name = "traileroBean")
@SessionScoped
public class TraileroBean implements Serializable{
    private List<Trailero> traileros;
    private Trailero trailero;

    public TraileroBean() {
    }

    public List<Trailero> getTraileros() {
        return traileros;
    }

    public void setTraileros(List<Trailero> traileros) {
        this.traileros = traileros;
    }

    public Trailero getTrailero() {
        return trailero;
    }

    public void setTrailero(Trailero trailero) {
        this.trailero = trailero;
    }
    
    public String listar(){
        TraileroDAO dao = new TraileroDAO();
        try {
            traileros = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Traileros";
    }
    
    public String eliminar(){
        TraileroDAO dao = new TraileroDAO();
        try {
            dao.delete(trailero);
            traileros = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Traileros";
    }
    
    public String iniciar(){
        trailero = new Trailero();
        return "Iniciar";
    }
    
    public String guardar(){
        TraileroDAO dao = new TraileroDAO();
        try {
            if(trailero.getIdTrailero()!=0){
                dao.update(trailero);
            }else{
                dao.insert(trailero);
            }
            traileros = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Trailero trailero){
        this.trailero=trailero;
        return "Editar";
    }
}