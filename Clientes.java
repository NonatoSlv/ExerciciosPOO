/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientes;

/**
 *
 * @author Admin
 */
public class Clientes {
 String nome;
 String email;
 String telefone;
    double compras1, compras2, compras3;
    
     double calcularCompras(){
        return (compras1+compras2+compras3);
    }
    void exibirInformacoes() {
        System.out.println("Informações do cliente: " + nome + ", " + email + " e " + telefone);
        System.out.print("O valor total das compras é: " + calcularCompras());
    }
}