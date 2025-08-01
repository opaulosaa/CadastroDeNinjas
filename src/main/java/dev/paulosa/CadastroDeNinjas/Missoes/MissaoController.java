package dev.paulosa.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    @GetMapping("/listar")
    public String listarMissao(){
        return "Missoes listadas";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "missao alterada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada";
    }

}
