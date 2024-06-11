package java_exam.Service;



import java.util.List;

import java_exam.Entities.Professeur;
import java_exam.repository.ProfesseurRepository;

public class ProfesseurService {
    private ProfesseurRepository professeurRepository;

  
    public ProfesseurService() {
        this.professeurRepository = new ProfesseurRepository();
    }


    public List<Professeur> listerProfesseurs() {
        return professeurRepository.listerProfesseurs();
    }


}

