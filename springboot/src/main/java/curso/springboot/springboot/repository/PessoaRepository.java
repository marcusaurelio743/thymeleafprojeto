package curso.springboot.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import curso.springboot.springboot.model.Pessoa;


public interface PessoaRepository extends CrudRepository<Pessoa, Long>{
	
	@Query("select p from Pessoa p  where upper(p.nome) like upper(:nome)")
	List<Pessoa> findPessoaByName( @Param("nome") String nome);

}
