/**
 * This file was generated by the JPA Modeler
 */
package joke.hfad.com.miudelar;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DtAsignatura implements Serializable {

    private Long codigo;

    private String nombre;

    private List<DtAsignatura_Carrera> asignatura_Carreras;

    private List<DtCarrera> carreras;

    public DtAsignatura(Long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public DtAsignatura() {
    }

    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<DtAsignatura_Carrera> getAsignatura_Carreras() {
        return this.asignatura_Carreras;
    }

    public void setAsignatura_Carreras(List<DtAsignatura_Carrera> asignatura_Carreras) {
        this.asignatura_Carreras = asignatura_Carreras;
    }

    public List<DtCarrera> getCarreras() {
        return this.carreras;
    }

    public void setCarreras(List<DtCarrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DtAsignatura other = (DtAsignatura) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    
}
