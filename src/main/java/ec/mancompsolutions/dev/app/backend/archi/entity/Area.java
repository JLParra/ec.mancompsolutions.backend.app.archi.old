package ec.mancompsolutions.dev.app.backend.archi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AREA")
public class Area extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String nombre;

    @OneToMany(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinTable(
            name = "area_epts",
            joinColumns = @JoinColumn(name = "area_id"),
            inverseJoinColumns = @JoinColumn(name = "epts_id")
    )
    private List<Departamento> departamentos  = new ArrayList<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_edfo")
    private EstadoFuncionamiento estadoFuncionamiento;
}
