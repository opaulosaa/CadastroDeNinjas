package dev.paulosa.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é a primeira mensagem nessa rota";
    }

    //add ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    //mostrar todos os dias(READ)
    @GetMapping("/todos")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //mostrar ninja por id(READ)
    @GetMapping("/todos/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    //alterar dados dos ninjas(UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID(){
        return "Ninja alterado";
    }

    //deletar ninja(DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorID(@PathVariable Long id){
        ninjaService.deleteNinjaPorId(id);
    }

}
