/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Projeto;
import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class MainTarefa {
    public static void main (String[]args) {
        
        Tarefa tarefa1 = new Tarefa();
        tarefa1.tarefa = "Revisar código";
        tarefa1.descricao = "Fazer uma revisão dos códigos em JavaScript";
        tarefa1.prazo = "20/02/2025";
       
        tarefa1.exibirInformacoes();
         tarefa1.cadastrarTarefaNaoFinazada();
         tarefa1.exibirInformacoes();
        tarefa1.cadastrarTarefaFinazada();
        tarefa1.exibirInformacoes();
        
    }
}
