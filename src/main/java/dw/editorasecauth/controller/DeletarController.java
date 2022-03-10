package dw.editorasecauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;


import dw.editorasecauth.model.Artigo;
import dw.editorasecauth.repository.ArtigoRepository;

@Controller
class DeletarController {

    @Autowired
    ArtigoRepository rep;

        /*
    * DEL /artigos/:id : remover artigo dado um id
    */
    @GetMapping("/artigos/{id}/deletar")
    public String deleteArtigo(@PathVariable("id") long id)
    {
        Artigo artigo = rep.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid artigo Id:" + id));
        rep.delete(artigo);
        return "redirect:/artigos";
    }
}