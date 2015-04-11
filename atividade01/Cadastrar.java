import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar 
{
	
	public static void main(String[] args) throws Exception
	{
	
     		String nome;
		String sobrenome;
		int idade;
		int qtde = 0;
		Alunos cadastro = null;
		
	    qtde = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos você quer cadastrar ? : "));

	    for(int i=0; i < qtde; i++)
	    {
	    	
			nome =      JOptionPane.showInputDialog(null,"Digite o nome do aluno: ");
			sobrenome = JOptionPane.showInputDialog(null,"Digite o sobrenome do aluno: ");
		   	idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade do aluno: "));
		
		    cadastro = new Alunos(qtde,nome+sobrenome,idade);
		    cadastro.incluirRegistro(cadastro);
		    
		    List<Alunos> cadastrar = new ArrayList<Alunos>();
		    Alunos novos = cadastro;
		    cadastrar.add(novos);
		    
		   Alunos ver;
			
			for (int j = 0; j < cadastrar.size(); j++)
			{
			
				ver = cadastrar.get(j);
				
				System.out.println("Alunos Cadastrados:  ("+(j+1)+")" +ver);
				ver.exibirDados();
			   	ver.salvarDados();
			}
			
			cadastrar.clear();
		    
		  }
	

	  }	
		
}


