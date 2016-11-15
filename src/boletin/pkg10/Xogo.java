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
public class Xogo {
    public void xogo (){
        int n,i,m;
        int c=0;
        do {
            n=Integer.parseInt(JOptionPane.showInputDialog("numero"));
        }while (n<1||n>50);
        do {
            i=Integer.parseInt(JOptionPane.showInputDialog("intentos"));
        }while (i<=0);
        do{
            m=Integer.parseInt(JOptionPane.showInputDialog("numero"));
            if (m<n){
                System.out.println("maior");
                c++;}
            else if (m>n){
                    System.out.println("menor");
                    c++;
            }
            else
                System.out.println("correcto");
        }while (m!=n&&c!=i); 
    }
    public void xogo2(){
        int c=0;
        int n,i;
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
