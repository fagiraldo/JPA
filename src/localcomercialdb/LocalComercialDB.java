/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localcomercialdb;

import edu.sergioArboleda.dao.ServiceImpl;
import edu.sergioArboleda.vo.FormaPago;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fabian.giraldo
 */
public class LocalComercialDB  {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocalComercial");
       EntityManager em = emf.createEntityManager();
       em.getTransaction().begin();
       ServiceImpl service = new ServiceImpl();
       service.setEntityManager(em);
       service.setType(FormaPago.class);
    
       FormaPago formaPago= new FormaPago();
       formaPago.setId(1);
       formaPago.setCodigo("Test");
       service.save(formaPago);
       
       em.getTransaction().commit();
       em.close();
       emf.close();
    }
}
