package cl.duoc.msvc_envio.model;

import jakarta.persistence.Entity;
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
    private int numeroVenta;
    private String nombreClienteString;
    private String correoCliente;
    private int telefonoCliente;
    private String direccion;
    private String estadoEnvio;
    private String idUsuario;
}
