package tn.spring.projet.interfaces;

import java.util.List;

import tn.spring.projet.Entity.Aide;

public interface IAideservice {
	List<Aide> retrieveAllAide();
	Aide addAide (Aide o);
	Aide updateAide (Aide o);
	Aide retrieveAide (Long id);
	void removeAide (Long id);
	void updateAidee(Aide a, long id);
	List<Aide> getAllAideClasse();
	
	
	
}
