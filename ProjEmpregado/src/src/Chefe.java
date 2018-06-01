/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

/**
 * @author Bianca
 **/
public class Chefe extends EmpregadoBase
{
    protected double gratificacao;
    
    public Chefe()
    {}
    
    public Chefe(String n, String s, double sal, double grat)
    {
        super(n, s, sal);
        
        gratificacao = grat;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public double calcularSalario()
    {
        return salarioBase + gratificacao;
        //return super.calcularSalario() + gratificacao;
    }
    
   
}
