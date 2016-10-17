package com.example.android.gdgabc_todo.model;

import java.util.Date;

/**
 * Created by wesleysilva on 10/15/16.
 */

public class Tarefa {
    private String titulo;
    private String descricao;
    private String status;
    private Date data;

    public Tarefa(String titulo, String descricao, String status, Date data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
