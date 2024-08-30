package br.com.danfreitz.domain;

import java.util.Objects;

/**
 * @author Danfreitz s
 */

public class Cliente {

    private String nome;
    private Long cpf;
    private Long telefone;
    private String email;
    private String endereco;

    public Cliente(String nome, Long cpf, Long telefone, String email, String endereco) {

        this.nome = nome;

        this.cpf = Long.valueOf(cpf.trim());
        this.telefone = Long.valueOf(telefone.trim());
        this.email = email;
        this.endereco = endereco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf) && Objects.equals(telefone, cliente.telefone) && Objects.equals(email, cliente.email) && Objects.equals(endereco, cliente.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, telefone, email, endereco);
    }

    @Override
    public String toString() {
        return "br.com.danfreitz.domain.Cliente{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                '}';
    }
}



