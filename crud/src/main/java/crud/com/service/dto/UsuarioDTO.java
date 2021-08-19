package crud.com.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;
import crud.com.domain.enumeration.Estado;

/**
 * A DTO for the {@link crud.com.domain.Usuario} entity.
 */
public class UsuarioDTO implements Serializable {
    
    private Long id;

    @NotNull
    @Size(max = 15)
    private String cedula;

    @NotNull
    @Size(max = 70)
    private String nombre;

    @NotNull
    @Size(max = 70)
    private String apellido;

    @Size(max = 15)
    private String telefono;

    @Size(max = 70)
    private String correoElectronico;

    @Size(max = 150)
    private String observaciones;

    @NotNull
    private Estado estado;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UsuarioDTO usuarioDTO = (UsuarioDTO) o;
        if (usuarioDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), usuarioDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
            "id=" + getId() +
            ", cedula='" + getCedula() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", correoElectronico='" + getCorreoElectronico() + "'" +
            ", observaciones='" + getObservaciones() + "'" +
            ", estado='" + getEstado() + "'" +
            "}";
    }
}
