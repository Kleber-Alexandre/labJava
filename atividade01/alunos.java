import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Alunos 
{

	private String nome,sobrenome;
	private int idade, qtde, novo_aluno;
	private Alunos[] alunos;

	public Alunos (int q, String n, String sn, int id) 
	{
		
		this.nome = n;
		this.sobrenome = sn;
		this.idade = id;
		
		this.qtde = q;
		alunos = new Alunos[qtde];
		novo_aluno=0;
	}

	public void exibirDados()
	{
	
	JOptionPane.showMessageDialog(null,"NOME: " +nome+ " ,SOBRENOME: " +sobrenome+ " ,IDADE: " +idade);
        }


	public  void incluirRegistro (Alunos novo)
	{
	
	alunos [novo_aluno] = novo;
	novo_aluno = novo_aluno + 1;
	
	}


	public void exibirRegistros()
	{
	
        	for(int i = 0; i < alunos.length; i ++)
		{
			if(alunos[i] !=null)
			{
		
			alunos[i].exibirDados();
			
			}
		
		}
	
	}


	public void salvarDados() throws Exception
	{
	
	File arquivo = new File("C:\\ExerciciosAlander\\RegistroDeAlunos.log");
	FileWriter gravar = new FileWriter(arquivo);
	gravar.write("Registros de Alunos: "+ alunos);
	gravar.close();
	
	}
}