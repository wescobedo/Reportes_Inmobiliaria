package cl.praxis.ReportesInmobiliaria.controller;

import cl.praxis.ReportesInmobiliaria.model.entities.Project;
import cl.praxis.ReportesInmobiliaria.model.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ProjectRestController {
    private final ProjectService service;

    public ProjectRestController(ProjectService service) {
        this.service = service;
    }
    private HttpStatus status = HttpStatus.OK;

    @GetMapping
    public ResponseEntity<List<Project>> findAll() {
        List<Project> project = service.findAll();

        if (project == null || project.size() == 0) {
            status = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<>(project, status);

    }
    @GetMapping("/{id}")
    public ResponseEntity<Project> findOne(@PathVariable("id") int id){

        Project project = service.findOne(id);

        if (project == null){
            status = HttpStatus.NOT_FOUND;
        }

        return new ResponseEntity<>(project, status);
    }



}
