package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.scel.model.Usuario;

public class UC02CadastrarUsuario {

	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setRa("2014050519");
			umUsuario.setNome("Aline dos Santos");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT02CadastrarUsuarioComDadosInvalidos() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setRa("");
			umUsuario.setNome("Aline dos Santos");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT03CadastrarUsuarioComDadosInvalidos() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setRa(null);
			umUsuario.setNome("Aline dos Santos");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT04CadastrarUsuarioComDadosInvalidos() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setRa("2014050519");
			umUsuario.setNome("");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT05CadastrarUsuarioComDadosInvalidos() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setRa("2014050519");
			umUsuario.setNome(null);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT06Verifica_Obtem_ra() {
		// cenario
		Usuario umUsuario = new Usuario();
		try {
			//acao
			umUsuario.setRa("2014050519");
			umUsuario.setNome("Aline dos Santos");
		} catch (RuntimeException e) {
			//verificacao
			fail("nao deve falhar");
		}
		assertEquals("2014050519", umUsuario.getRa());
	}
	
	@Test
	public void CT07Verifica_Obtem_Nome() {
		// cenario
		Usuario umUsuario = new Usuario();
		try {
			//acao
			umUsuario.setRa("2014050519");
			umUsuario.setNome("Aline dos Santos");
		} catch (RuntimeException e) {
			//verificacao
			fail("nao deve falhar");
		}
		assertEquals("Aline dos Santos", umUsuario.getNome());
	}
	
}
