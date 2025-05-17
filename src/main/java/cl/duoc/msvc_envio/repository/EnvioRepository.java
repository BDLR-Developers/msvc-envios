package cl.duoc.msvc_envio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.msvc_envio.model.Envio;

@Repository
public interface EnvioRepository extends JpaRepository<Envio, Integer> {

}
