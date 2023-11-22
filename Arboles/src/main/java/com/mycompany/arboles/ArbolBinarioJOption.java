/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboles;
import javax.swing.JOptionPane;
/**
 *
 * @author lalit
 */
class Nodo{
    int info;
    Nodo izq,der;
}
public class ArbolBinarioJOption {
    Nodo raiz;
    String con="";
    String dato="";
    public ArbolBinarioJOption(){
        raiz=null;
    }
    public void insertar(int info){
        Nodo nuevo=new Nodo();
        nuevo.info=info;
        nuevo.izq=null;
        nuevo.der=null;
        if (raiz==null) {
            raiz=nuevo;
        }else{
            Nodo anterior=null,reco;
            reco=raiz;
            while(reco!=null)
            {
                anterior=reco;
                if (info<reco.info) {
                    reco=reco.izq;
                }else
                    reco=reco.der;
            }
            if (info<anterior.info) {
                anterior.izq=nuevo;
            }else
                anterior.der=nuevo;
        }
    }
    
    private void imprimirPre(Nodo reco){
        if (reco!=null) {
            dato=Integer.toString(reco.info);
            dato+=",  ";
            Contatenar(dato);
            imprimirPre(reco.izq);
            imprimirPre(reco.der);
        }
    }
    public void imprimirPre(){
        imprimirPre(raiz);
        JOptionPane.showMessageDialog(null,"Impresion Preorden:\n"+con);
        con="";
    }
    private void imprimirInOrden(Nodo reco){
        if (reco!=null) {
            imprimirInOrden(reco.izq);
            dato=Integer.toString(reco.info);
            dato+=",  ";
            Contatenar(dato);
            imprimirInOrden(reco.der);
        }
    }
    public void imprimirIn(){
        imprimirInOrden(raiz);
        JOptionPane.showMessageDialog(null,"Impresion InOrden:\n"+con);
        con="";
    }
    private void imprimirPost(Nodo reco){
        if (reco!=null) {
            imprimirPost(reco.izq);
            imprimirPost(reco.der);
            dato=Integer.toString(reco.info);
            dato+=",  ";
            Contatenar(dato);
        }
    }
    public void imprimirPost(){
        imprimirPost(raiz);
        JOptionPane.showMessageDialog(null, "Impresion PostOrden:\n "+con);
        con="";
    }
    
    public void Contatenar(String dato){
        con=con+dato;
    }
}