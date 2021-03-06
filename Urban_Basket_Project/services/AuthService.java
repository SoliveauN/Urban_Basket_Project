package services;

import models.User;
import persistances.OraclePersistance;
import persistances.Persistance;

/**
 * Classe du Service d'authentification
 * @author BERGER Nicolas
 * @author SOLIVEAU Nicolas
 */
public class AuthService {

    private Persistance persistance;

    public AuthService(Persistance persistance){
        this.persistance = persistance;
    }

    public User login(String pseudo, String mdp) throws Exception {
        return persistance.getUser(pseudo,mdp);
    }
}
