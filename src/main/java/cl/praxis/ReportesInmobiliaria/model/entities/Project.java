package cl.praxis.ReportesInmobiliaria.model.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="project")

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="project_id")
    private int id;
    @Column(name="project_name")
    private String name;
    @Column(name="project_description")
    private String description;

    public Project() {
    }

    public Project(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
