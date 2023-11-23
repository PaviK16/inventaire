 package fr.hummaction.inventaire.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hummaction.inventaire.dao.AlimentRepository;
import fr.hummaction.inventaire.entity.Aliment;

@Service
public class AlimentServiceImpl implements AlimentService {

	private AlimentRepository alimentRepository;

	@Autowired
	public AlimentServiceImpl(AlimentRepository theAlimentRepository) {
		alimentRepository = theAlimentRepository;
	}
	
	@Override
	public List<Aliment> findAll() {
		// TODO Auto-generated method stub
		return alimentRepository.findAll();
	}

	@Override
	public Aliment findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Aliment> result = alimentRepository.findById(theId);
		Aliment theAliment = null;
		if(result.isPresent()) {
			theAliment = result.get();
		}
		else {
			throw new RuntimeException("Aliment non trouvé -> " + theId);
		}
		return theAliment;
	}

	@Override
	public void save(Aliment theAliment) {
		// TODO Auto-generated method stub
		alimentRepository.save(theAliment);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		alimentRepository.deleteById(theId);
	}

}
