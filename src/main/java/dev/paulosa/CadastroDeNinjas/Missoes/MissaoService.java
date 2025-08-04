package dev.paulosa.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {

    private MissaoRepository missaoRepository;

    public MissaoService(MissaoRepository missaoRepository) {
        this.missaoRepository = missaoRepository;
    }

    //listar todas as missoes
    public List<MissaoModel> listarMissoes(){
        return missaoRepository.findAll();
    }

    //listar missoes por id
    public MissaoModel listarMissaoPorId(Long id) {
        Optional<MissaoModel> missaoPorId = missaoRepository.findById(id);
        return missaoPorId.orElse(null);
    }

    //criar uma nova missao
    public MissaoModel criarMissao(MissaoModel missao) {
        return missaoRepository.save(missao);
    }

    //deletar uma missao
    public void deletarMissaoPorId(Long id) {
        missaoRepository.deleteById(id);
    }
}
