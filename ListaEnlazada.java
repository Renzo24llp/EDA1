/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class ListaEnlazada {
    private Nodo head; // Referencia al primer nodo (cabeza)
    private int size; // Número de elementos en la lista
// Constructor: crea una lista vacía
  public ListaEnlazada() {
            this.head = null; // La lista empieza vacía
            this.size = 0; // Tamaño inicial es cero
}
  public void insertarAlInicio(int clave) {
    Nodo temp = new Nodo(clave); // Crea nuevo nodo
    temp.siguiente = head; // Apunta nuevo nodo al inicio actual
    head = temp; // Actualiza la cabeza de la lista
    size++;
}
  public void add_tail(int key){
      //Crea nuevo nodo
       Nodo tail = new Nodo(key);
       
       if (head == null) //verifica que la lista este vacia
           head=tail;
       else { //usa una referencia temporal para recorrer la lista desde la cabeza
           
           Nodo temp = head;
          while ( temp.siguiente !=null)
              temp = temp.siguiente;
          //apunta el ulitmo nodo al nuevo nodo
          temp.siguiente = tail;
       }
      tail.siguiente = null;
      size +=1;
  }
  public Nodo getHead(){
        return head;
      
  }
  
  
}
