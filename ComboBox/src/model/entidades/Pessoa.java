package model.entidades;

import java.io.Serializable;

public class Pessoa implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String email;

	//Construtores
	public Pessoa() {}

	public Pessoa(Integer id, String nome, String email)
	{
		this.setId(id);
		this.setNome(nome);
		this.setEmail(email);
	}

	//Getters
	public Integer getId()
	{
		return this.id;
	}

	public String getNome()
	{
		return this.nome;
	}

	public String getEmail()
	{
		return this.email;
	}

	//Setters
	public void setId(Integer id)
	{
		this.id = id;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	//Métodos sobrescrevidos
	@Override
	public String toString()
	{
		return "Pessoa [ id = " + this.getId() + " | nome = " + this.getNome() + " | e-mail = " + this.getEmail() + " ]";
	}
}