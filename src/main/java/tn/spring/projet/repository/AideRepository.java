package tn.spring.projet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.spring.projet.Entity.Aide;
@Repository
public interface AideRepository extends JpaRepository<Aide ,Long> {
	@Query("Select a FROM Aide a ORDER BY a.monatnt DESC")
	public List<Aide> getAllAideClasseByMontant();
	


	@Query("SELECT a FROM Aide a WHERE CONCAT(a.Type_aide) LIKE %?1%")
	public List<Aide> search(String keyword);
}