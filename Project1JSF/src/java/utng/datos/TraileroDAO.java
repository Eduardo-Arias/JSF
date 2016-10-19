/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Trailero;
/**
 *
 * @author eduardo
 */
public class TraileroDAO extends DAO<Trailero>{
    
    public TraileroDAO() {
        super(new Trailero());
    }
    
    public Trailero getOneById(Trailero trailero) 
            throws HibernateException{
        return super.getOneById(trailero.getIdTrailero());
    }
}
