/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lalit
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArbolBinarioJOption abo=new ArbolBinarioJOption();
        int opc,res,info;
        String menu="\nÁRBOL BINARIO"
                + "\n1.Insertar un nodo"
                + "\n2.Imprimir recorrido Preorden"
                + "\n3.Imprimir recorrido Inorden"
                + "\n4.Imprimir recorrido Posorden"
                + "\n5.Salir"
                + "\n¿Que opcion desea?";
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opc){
                case 1:
                    do{
                        info=Integer.parseInt(JOptionPane.showInputDialog("Inserta el dato:"));
                        abo.insertar(info);
                        res=Integer.parseInt(JOptionPane.showInputDialog("\nQuieres insertar mas nodos \n1)Si\n2)No"));
                    }while(res==1);
                    break;
                case 2:
                    abo.imprimirPre();
                    break;
                case 3:
                    abo.imprimirIn();
                    break;
                case 4:
                    abo.imprimirPost();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"F I N   D E L   P R O G R A M A");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida. Escoga una de las opciones que hay en el menu");
   }
        }while(opc!=5);
    }

}
