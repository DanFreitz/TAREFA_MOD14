package br.com.danfreitz.domain.Dao;

import br.com.danfreitz.domain.Cliente;

import java.util.Collection;

/**
 * @author Danfreitz
 */

public interface IClienteDAO {

    public boolean cadastrarCliente(Cliente cliente);

    public void excluir(Cliente cliente);

    public void alterar(Cliente cliente);

    public Cliente Consultar(Long cpf);

    public Collection<Cliente> ConsultarCliente();
}
