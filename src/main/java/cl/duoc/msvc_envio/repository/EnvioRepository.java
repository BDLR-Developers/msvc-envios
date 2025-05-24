package cl.duoc.msvc_envio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.msvc_envio.model.Envio;

public interface EnvioRepository extends JpaRepository<Envio,Integer>{
    
}