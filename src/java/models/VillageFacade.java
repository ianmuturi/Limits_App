/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author imuturi
 */
@Stateless
public class VillageFacade extends AbstractFacade<Village> {

    @PersistenceContext(unitName = "ResidentsAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VillageFacade() {
        super(Village.class);
    }
    
}
