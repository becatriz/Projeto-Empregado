/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

/**
 * @author Bianca
 **/
public class Main 
{
    public static void main(String[] args)
    {        
        /*Empregado emp1 = new Empregado("Fulano", "Esotérico");
        EmpregadoBase emp2 = new EmpregadoBase("Bianca", 
                "Informática", 1000.0);
        EmpregadoHora emp3 = new EmpregadoHora("Bruno", 
                "Desenvolvimento", 10, 30);
        Chefe emp4 = new Chefe("Vanessa", "Chefia", 5000, 800); 
        EmpregadoComissionado emp5 = new EmpregadoComissionado("Atila",
                "Vendas", 1000, 50000, 15);
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);*/
        
        Empregado vetEmp[] = new Empregado[5];        
        
        vetEmp[0] = new Empregado("Fulano", "Esotérico");
        vetEmp[1] = new EmpregadoBase("Bianca", 
                "Informática", 1000.0);
        vetEmp[2] = new EmpregadoHora("Bruno", 
                "Desenvolvimento", 10, 30);
        vetEmp[3] = new Chefe("Vanessa", "Chefia", 5000, 800); 
        vetEmp[4] = new EmpregadoComissionado("Atila",
                "Vendas", 1000, 50000, 15);
        
        System.out.println("Salários:");
        
        for (int i = 0; i < vetEmp.length; i++)
            System.out.println(vetEmp[i].calcularSalario());
    }
}
