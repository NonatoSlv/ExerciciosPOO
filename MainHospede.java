/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package hospede;
import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class MainHospede {
    public static void main (String[]args) {
        
        Hospede hospede1 = new Hospede();
        hospede1.nome = "Daniel";
        hospede1.dias = 3;
        hospede1.quarto = 360;
        
        hospede1.exibirInformacoes();
        
        
    }
}
