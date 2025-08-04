package dev.paulosa.CadastroDeNinjas.Missoes;

import dev.paulosa.CadastroDeNinjas.Ninjas.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    private final MissaoService missaoService;
    private final NinjaService ninjaService;

    public MissaoController(MissaoService missaoService, NinjaService ninjaService) {
        this.missaoService = missaoService;
        this.ninjaService = ninjaService;
    }

    @GetMapping("/listar")
    public List<MissaoModel> listarMissao(){
        return missaoService.listarMissoes();
    }

    @GetMapping("/listar-por-id/{id}")
    public MissaoModel listarMissaoPorId(@PathVariable Long id) {
       return missaoService.listarMissaoPorId(id);
    }

    @PostMapping("/criar")
    public MissaoModel criarMissao(@RequestBody MissaoModel missao){
        return missaoService.criarMissao(missao);
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "missao alterada";
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(Long id){
        ninjaService.deleteNinjaPorId(id);
    }

}
