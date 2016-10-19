package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Trailer;
/**
 *
 * @author eduardo arias
 */
public class TrailerDAO extends DAO<Trailer>{
    
    public TrailerDAO() {
        super(new Trailer());
    }
    
    public Trailer getOneById(Trailer trailer)
        throws HibernateException{
        return super.getOneById(
                trailer.getIdTrailer());
    }
    
}
