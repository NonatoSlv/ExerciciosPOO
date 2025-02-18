/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

/**
 *
 * @author Admin
 */
public class main {
    public static void main (String[]args) {
        
        Clientes cliente1 = new Clientes();
        cliente1.nome = "Daniel";
        cliente1.email = "duartedaniel.contato@gmail.com";
        cliente1.telefone = "11 96807-0616";
        
        cliente1.compras1 = 6547;
        cliente1.compras2 = 34545;
        cliente1.compras3 = 454;     
        
        cliente1.exibirInformacoes();
        
        
    }
}
