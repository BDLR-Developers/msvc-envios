package cl.duoc.msvc_envio.controller.Envio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.msvc_envio.model.Envio;
import cl.duoc.msvc_envio.service.EnvioService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/envios")
public class Controller {
    
    @Autowired
    private EnvioService service;

    //private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Integer id) {
        Optional<Envio> envioOptional = service.buscarporId(id);
        if (envioOptional.isPresent()) {
            return ResponseEntity.ok(envioOptional.orElseThrow());
        }
        Map<String, Object> errorBody = new HashMap<>();
            errorBody.put("error", "Solicitud inválida");
            errorBody.put("codigo", 404);
            errorBody.put("detalle", "Numero de envio no encontrado.");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorBody);
    }

    @GetMapping
    public List<Envio> listaEnvios() {
        return service.listaEnvios();
    }
    
    @PostMapping
    public ResponseEntity<?> crearEnvio(@RequestBody Envio envio) {
        Optional<Envio> envioOptional = service.buscarporId(envio.getNumeroVenta());
        
        if (envioOptional.isPresent()) {
            Map<String, Object> errorBody = new HashMap<>();
                errorBody.put("error", "Solicitud inválida");
                errorBody.put("codigo", 400);
                errorBody.put("detalle", "El numero de venta ya existe");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.cargarEnvio(envio));
        
        
    }
    
}