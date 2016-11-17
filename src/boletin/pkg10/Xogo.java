package boletin.pkg10;
import javax.swing.JOptionPane;
public class Xogo {
    public void xogo (){
        int n,i,m,c=0;
        do {
            n=Integer.parseInt(JOptionPane.showInputDialog("numero a adiviñar"));
        }while (n<1||n>50);
        do {
            i=Integer.parseInt(JOptionPane.showInputDialog("intentos"));
        }while (i<=0);
        do{
            m=Integer.parseInt(JOptionPane.showInputDialog("numero"));
            if (m<n)
                System.out.println("maior");
            else if (m>n)
                    System.out.println("menor");
            else{
                System.out.println("correcto");
            break;}
            c++;
        }while (m!=n&&c!=i); 
        if (c==i)
            System.out.println("perdiste");
    }
    
    }        

