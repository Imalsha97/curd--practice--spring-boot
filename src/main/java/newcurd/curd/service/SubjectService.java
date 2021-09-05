package newcurd.curd.service;

import newcurd.curd.bean.Subject;
import newcurd.curd.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class SubjectService {
    @Autowired
    public SubjectRepository subjectRepository;
    public List<Subject> getAllSubject(){
        List<Subject> subjects = new ArrayList<>();
        subjectRepository.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void updateSubject(String id, Subject subject) {
        subjectRepository.save(subject);
    }

//    public void deleteSubject(String id) {
//        subjectRepository.deleteById(id);
//    }
    public void deleteSubject(String id) {
        subjectRepository.deleteById(id);

    }
    public Optional<Subject> getSubjectById(String id){
        return subjectRepository.getSubjectById(id);
    }


}
