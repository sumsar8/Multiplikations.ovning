import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
    
public class oga {
    public static void main (String[] args) {

        String a;
        int b;
        int c = 1;

        a = JOptionPane.showInputDialog("Vilka nummer?");
        b = Integer.parseInt(a);

        while(c>-5) {
            System.out.println(c + "*" + b + "=" + c * b);
            c++;
        }

    }

}