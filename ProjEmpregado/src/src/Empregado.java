/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

/**
 * @author Bianca
 **/
public class Empregado 
{
    protected String nome, setor;
    
    public Empregado()
    {}
    
    public Empregado(String n, String s)
    {
        nome = n;
        setor = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public double calcularSalario()
    {
        return 0;
    }
    
    public String toString()
    {
        return String.format("\nNome: %s\nSetor: %s\nSalário: "
                + "%.2f", nome, setor, calcularSalario());
    }
}
