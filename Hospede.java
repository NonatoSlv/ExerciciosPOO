/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospede;
import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class Hospede {
 String nome;
 Integer dias;
 Integer quarto;
   double calcularDias(){
        return (dias * quarto);
    }
    void exibirInformacoes() {
        System.out.println("O nome do hospede é: " + nome + " e a quantidade de dias hospedado foram: " + dias + " dias");
        System.out.print("O valor a pagar é: R$" + calcularDias());
       
    }
}