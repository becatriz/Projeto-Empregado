/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

/**
 * @author Bianca
 **/
public class EmpregadoComissionado extends EmpregadoBase 
{
    protected double valorVendas, porcComissao;
    
    public EmpregadoComissionado()
    {}
    
    public EmpregadoComissionado(String n, String s, double sal,
            double val, double porc)
    {
        super(n, s, sal);
        
        valorVendas = val;
        porcComissao = porc;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getPorcComissao() {
        return porcComissao;
    }

    public void setPorcComissao(double porcComissao) {
        this.porcComissao = porcComissao;
    }
    
    private double calcularComissao()
    {
        return valorVendas * porcComissao /100;
    }
    
    public double calcularSalario()
    {
        return salarioBase + calcularComissao();
        //return super.calcularSalario() + calcularComissao();
    }
    
   
}

