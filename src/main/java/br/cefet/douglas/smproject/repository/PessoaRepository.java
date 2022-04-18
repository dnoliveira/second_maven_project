package br.cefet.douglas.smproject.repository;

import br.cefet.douglas.smproject.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {



}
