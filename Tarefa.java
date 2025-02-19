/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Projeto;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class Tarefa {
 String tarefa;
 String descricao;
 String prazo;
 Boolean concluido;
 

void cadastrarTarefaFinazada() {
    concluido = true;
}

void cadastrarTarefaNaoFinazada() {
    concluido = false;
}
   
    void exibirInformacoes() {
        System.out.println("O nome da tarefa é: " + tarefa + ", a descrição é: " + descricao + " e o prazo: " + prazo + "O status é:" + concluido);
    }
}