/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Xogo xogo=new Xogo();
        Xogo2 xogo2= new Xogo2 ();
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Elige: \n 1:1vs1 \n 2:vs IA"));
        switch (opc){
                case 1:
                xogo.xogo();
                break;
                case 2:
                xogo2.xogo();
                break;
                default:
                    System.out.println("Adíos");
    }
    }
}
