package cl.duoc.msvc_envio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Envio {
    
    @Id
    private Integer numeroVenta;
    private String nombreCliente;
    private String correoCliente;
    private String telefonoCliente;
    private String direccion;
    private String estadoEnvio;
    private Integer idUsuario;
}
