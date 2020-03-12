package testejpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CriarBD {
    
    public static void main(String[] args) {
        
        EntityManager gerenciador =
                Persistence
                    .createEntityManagerFactory("persitence-unit1")
                    .createEntityManager();
        
    }
    
}
