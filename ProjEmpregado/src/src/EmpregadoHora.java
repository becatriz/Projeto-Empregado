/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

/**
 * @author Bianca
 **/
public class EmpregadoHora extends Empregado
{
    protected double numHoras, valorHora;
    
    public EmpregadoHora()
    {}
    
    public EmpregadoHora(String n, String s, double num, 
            double val)
    {
        super(n, s);
        
        numHoras = num;
        valorHora = val;
    }

    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calcularSalario()
    {
        return numHoras * valorHora;
    }
    
   
}
