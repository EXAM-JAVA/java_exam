package java_exam.Service;



import java.util.List;

import java_exam.Entities.Classe;
import java_exam.repository.ClasseRepository;

public class ClasseService {
    private ClasseRepository classeRepository;

 
    public ClasseService() {
        this.classeRepository = new ClasseRepository();
    }

   
    public List<Classe> listerClasses() {
        return classeRepository.listerClasses();
    }

  
}

