/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

/**
 * @author Bianca
 **/
public class EmpregadoBase extends Empregado
{
    protected double salarioBase;
    
    public EmpregadoBase()
    {}
    
    public EmpregadoBase(String n, String s, double sal)
    {
        super(n, s);
        
        salarioBase = sal;
    }

    public double getSalarioBase() 
    {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) 
    {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario()
    {
        return salarioBase;
    }   
   
}
