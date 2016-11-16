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
public class Xogo2 {
        public void xogo(){
        int c=0,n,i;
          int e = (int) Math.floor(Math.random()*50+1);;
        do {
            i=Integer.parseInt(JOptionPane.showInputDialog("intentos"));
        }while (i<=0);
       do{
           do {
            n=Integer.parseInt(JOptionPane.showInputDialog("numero"));
           } while (n<1 || n>50);
            int r=Math.abs(e-n);
            if (r>20){
            System.out.println("moi lonxe"); 
            c++;}
            else if (r>=10){
            System.out.println("lonxe"); 
            c++;}
            else if (r>5){
            System.out.println("preto");
            c++;}
           else if (r!=0){   
            System.out.println("moi preto");
            c++;}
            else if (r==0)
            System.out.println("correcto");
        }while (n!=e&&c!=i); 
}
}
