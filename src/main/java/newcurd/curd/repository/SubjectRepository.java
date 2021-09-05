package newcurd.curd.repository;

import newcurd.curd.bean.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SubjectRepository extends CrudRepository<Subject , String> {


    Optional<Subject> getSubjectById(String id);
}
