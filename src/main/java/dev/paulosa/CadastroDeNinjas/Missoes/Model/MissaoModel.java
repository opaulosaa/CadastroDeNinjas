package dev.paulosa.CadastroDeNinjas.Missoes.Model;

import dev.paulosa.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //Uma missao para muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;



}
