package ec.mancompsolutions.dev.app.backend.archi.models.services;

import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoInventario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EstadoInventarioService {

   public List<EstadoInventario>findAll();
}
