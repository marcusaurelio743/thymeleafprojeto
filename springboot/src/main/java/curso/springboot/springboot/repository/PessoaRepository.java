package curso.springboot.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import curso.springboot.springboot.model.Pessoa;


public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

}
