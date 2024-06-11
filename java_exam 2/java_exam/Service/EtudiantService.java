package java_exam.Service;



import java.util.List;

import java_exam.Entities.Etudiant;
import java_exam.repository.EtudiantRepository;

public class EtudiantService {
    private EtudiantRepository etudiantRepository;

 
    public EtudiantService() {
        this.etudiantRepository = new EtudiantRepository();
    }

  
    public List<Etudiant> listerEtudiants() {
        return etudiantRepository.listerEtudiants();
    }


}

