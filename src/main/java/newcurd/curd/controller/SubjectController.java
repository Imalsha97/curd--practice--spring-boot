package newcurd.curd.controller;

import newcurd.curd.bean.Subject;
import newcurd.curd.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjets(){
        return subjectService.getAllSubject();

    }
    @RequestMapping(method = RequestMethod.POST,value = "/subjects")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/subjects/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject)
    {
        subjectService.updateSubject(id, subject);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/subjects/{id}")
    public void deleteSubject(@PathVariable String id)
    {
        subjectService.deleteSubject(id);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/subjects/{id}")
    public Subject getSubjectById(@PathVariable("id")   String id){
        return subjectService.getSubjectById(id)
                .orElse(null);
    }


}
