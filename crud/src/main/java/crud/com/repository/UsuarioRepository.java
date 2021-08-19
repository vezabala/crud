package crud.com.repository;

import crud.com.domain.Usuario;

import crud.com.domain.enumeration.Estado;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data  repository for the Usuario entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCedula(String cedula);

    List<Usuario> findAllByEstado (Estado estado);
}
