package cl.praxis.ReportesInmobiliaria.model.service;
import cl.praxis.ReportesInmobiliaria.model.entities.Project;
import java.util.List;

public interface ProjectService {
    List<Project> findAll();
    Project findOne(int id);
    Project create(Project project);
    Project update(Project project);
    boolean delete(int id);
}



