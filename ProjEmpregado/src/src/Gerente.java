/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

/**
 * @author Bianca
 **/
public class Gerente extends EmpregadoBase
{
    protected EmpregadoBase secretaria;
    
    public String toString()
    {
        return String.format("Gerente: %s\nSecretária: %s", super.toString(), secretaria);
    }
}
