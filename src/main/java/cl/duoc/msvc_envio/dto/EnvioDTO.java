package cl.duoc.msvc_envio.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnvioDTO {

    private int numeroVenta;
    private String nombreClienteString;
    private String correoCliente;
    private int telefonoCliente;
    private String direccion;
    private String estadoEnvio;
    private String idUsuario;

}
