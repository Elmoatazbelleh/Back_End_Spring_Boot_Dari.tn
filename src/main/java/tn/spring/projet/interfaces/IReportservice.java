package tn.spring.projet.interfaces;

import java.util.List;

import tn.spring.projet.Entity.Report;


public interface IReportservice {
	List<Report> retrieveAllReport();
	Report addReport (Report o);
	Report updateReport (Report o);
	Report retrieveReport (Long id);
	void removeReport (Long id);
	float pourcentageBadLanguage();
	float pourcentageDamage();
	void updateReporte(Report a, long id);

}