package br.cefet.douglas.smproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "table_pessoa")
@ToString
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 64)
    private String nome;


    private Instant dataNascimento;
    private String cpf;
    private String telefone;
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;
    private Boolean isActive;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public static Pessoa parseNote(String line) {
        String[] text = line.split(",");
        Pessoa note = new Pessoa();
        note.setId(Long.parseLong(text[0]));
        note.setNome(text[1]);
        return note;
    }


}
