package dw.editorasecauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dw.editorasecauth.model.Artigo;

import java.util.List;

public interface ArtigoRepository extends JpaRepository<Artigo, Long>{

    List<Artigo> findByPublicado(boolean publicado);

    List<Artigo> findByTituloContaining(String titulo);
    
}
