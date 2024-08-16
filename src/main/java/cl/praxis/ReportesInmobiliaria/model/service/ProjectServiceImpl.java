package cl.praxis.ReportesInmobiliaria.model.service;
import cl.praxis.ReportesInmobiliaria.model.entities.Project;
import cl.praxis.ReportesInmobiliaria.model.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository repository;

    public ProjectServiceImpl(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Project> findAll() {
        return repository.findAll();
    }

    @Override
    public Project findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Project project) {
        Project result = repository.save(project);
        System.out.println("creado el id " + result.getId());

        return result != null;
    }

    @Override
    public boolean update(Project project) {
        project = repository.save(project);

        return project != null;
    }


    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        if (exist){
            repository.deleteById(id);
        }
        return exist;
    }
}

