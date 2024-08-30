package br.com.danfreitz.domain.Dao;

import br.com.danfreitz.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ClienteMapDAO implements IClienteDAO {

    private map<Long, Cliente> map;

    public ClienteMapDAO() {
        this.map=new HashMap<>();
    }
    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())) {
            return false;
    }
    this.map.put(cliente.getCpf(), cliente);
    return true;

    @Override
        public void excluir(Long cpf) {
            Cliente clienteCadastrado = map.get(cpf);
            map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }

        if (clienteCadastro != null) {
            this.map.remove(clienteCadastro.getCpf(), clienteCadastro);
        }
    }

    @Override
    public void alterarCliente(Cliente cliente) {
        Cliente clienteCadastro = this.map.get(cliente.getCpf());
        if (clienteCadastro != null) {

            clienteCadastro.setNome(cliente.getNome());
            clienteCadastro.setCpf(cliente.getCpf());
            clienteCadastro.setEmail(cliente.getEmail());
            clienteCadastro.setEndereco(cliente.getEndereco());
            clienteCadastro.setTelefone(cliente.getTelefone());
        }

    }

    @Override
    public Cliente Consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> ConsultarCliente() {
        return this.map.values();
    }
}
