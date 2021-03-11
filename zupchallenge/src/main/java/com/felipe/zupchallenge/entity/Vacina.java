package com.felipe.zupchallenge.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @OneToOne
    @JoinColumn(name = "usuario_email")
    private Usuario usuario;

    @Column
    @NotNull
    private LocalDate dataAplicacao;

    public Vacina(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getEmailUsuario() {
        return usuario;
    }

    public void setEmailUsuario(Usuario emailUsuario) {
        this.usuario = emailUsuario;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
}
