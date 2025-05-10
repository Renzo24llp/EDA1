/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class ProjectS06LE {
    public static void main(String[] args) {
        
        ListaEnlazada L = new ListaEnlazada();
        L.insertarAlInicio(7);
        L.add_tail(5);
        L.add_tail(3);
        L.add_tail(8);
        
        Nodo temp = L.getHead();
        
        while(temp != null){
            System.out.println(temp.clave);
            temp = temp.siguiente;
            
        }
        System.out.println("");
    }
}
