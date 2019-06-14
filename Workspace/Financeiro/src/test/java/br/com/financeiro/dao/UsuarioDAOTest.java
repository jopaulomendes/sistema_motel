package br.com.financeiro.dao;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Ignore;
import org.junit.Test;

import br.com.financeiro.domain.Pessoa;
import br.com.financeiro.domain.Usuario;

public class UsuarioDAOTest {
	@Test
//	@Ignore
	public void salvar(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(1L);
		
		System.out.println("Pessoa Encontrada");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenhaSemCriptografia("1234");
		SimpleHash hash = new SimpleHash("md5", usuario.getSenhaSemCriptografia() );
		usuario.setSenha(hash.toHex());
		usuario.setTipo('A');
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
		
		System.out.println("Usuário salvo com sucesso.");
	}
	
	
	@Test
//	@Ignore
	public void autenticar(){
		String cpf = "931.740.632-72";
		String senha = "123456";
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.autenticar(cpf, senha);
		
		System.out.println("Usuário autentica: " + usuario);
	}
}	
