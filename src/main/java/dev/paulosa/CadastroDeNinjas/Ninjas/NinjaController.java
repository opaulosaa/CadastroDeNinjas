package dev.paulosa.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é a primeira mensagem nessa rota";
    }

    //add ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    //mostrar todos os dias(READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinas(){
        return "Todos";
    }

    //mostrar ninja por id(READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjas() {
        return "Todos";
    }

    //alterar dados dos ninjas(UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID(){
        return "Ninja alterado";
    }

    //deletar ninja(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Ninja deletado";
    }

}
