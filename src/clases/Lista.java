package clases;

public class Lista {
    private Nodo primero;

    private Lista () {
        this.primero = null;
    }

    public static Lista crearLista(){
        return new Lista();
    }

    public boolean esVacia() {
        return this.primero == null;
    }

    public void insertarAlInicio(int x) {
        Nodo unNodo = new Nodo(x);
        if(!this.esVacia()) {
            unNodo.setSiguiente(primero);
        }
        this.primero = unNodo;
    }

    public void insertarAlFinal(int x) {
        Nodo nodoAux = primero;
        if (this.esVacia()) {
            primero = new Nodo(x);
        }
        while (nodoAux.getSiguiente() != null) {
            nodoAux = nodoAux.getSiguiente();
        }
        nodoAux.setSiguiente(new Nodo(x));
    }

    public void mostrar() {
        Nodo nodoAux = primero;

        System.out.println("La lista a mostrar es: ");
        while (nodoAux != null) {
            System.out.println("Valor = " + nodoAux.getDato());
            nodoAux = nodoAux.getSiguiente();
        }
    }

    public int cantidad() {
        int i = 0;
        Nodo nodoAux = primero;

        while (nodoAux != null) {
            i++;
            nodoAux = nodoAux.getSiguiente();
        }
        return i;
    }

    public void borrarPrimero() {
        if (!this.esVacia())  primero = primero.getSiguiente();
    }
    //Elimina el primer nodo de la lista

    public void borrarUltimo() {
        Nodo nodoAux = primero;
        if (this.esVacia() || nodoAux.getSiguiente() == null ) {
            return;
        }
        while (nodoAux.getSiguiente().getSiguiente() != null) {
            nodoAux = nodoAux.getSiguiente();
        }
        nodoAux.setSiguiente(null);
    }
    //Elimina el último nodo de la lista

    public void borrarConValor(int buscado) {
        Nodo nodoActual = primero;
        Nodo nodoAnterior = primero;
        while (nodoActual != null) {
            if (nodoActual.getDato() == buscado) {
                nodoAnterior.setSiguiente(nodoActual.getSiguiente());
            }else {
                nodoAnterior = nodoActual;
            }
            nodoActual = nodoActual.getSiguiente();
        }
    }
    //Elimina todos los nodos que lo contengan el valor igual a x

    public void borrarEnPosicion(int posicion) {
        int i = 1;

        if (posicion == 0) {
            this.borrarPrimero();
            return;
        }

        Nodo nodoAux = primero;

        while (nodoAux != null) {
            if (i == posicion) {
                nodoAux.setSiguiente(nodoAux.getSiguiente().getSiguiente());
            }
            i++;
            nodoAux = nodoAux.getSiguiente();
        }
    }
    //Eliminar el nodo de la posición posicion
    public int dameValorEnPosicion(int posicion) {
        int i = 0;
        Nodo nodoAux = primero;

        while (nodoAux != null) {
            if (i == posicion) {
                return nodoAux.getDato();
            }
            nodoAux = nodoAux.getSiguiente();
            i++;
        }

        return 0;
    }
    //Devuelve el contenido del nodo en la posición posicion
    public void modificarValorEnPosicion(int valor, int posicion) {
        int i = 0;
        Nodo nodoAux = primero;

        while (nodoAux != null) {
            if (i == posicion) {
                nodoAux.setDato(valor);
                break;
            }
            nodoAux = nodoAux.getSiguiente();
            i++;
        }

    }
    //Modificar el contenido del nodo de la posición posicion
    public void insertarEnPosicion(int valor, int posicion) {
        int i = 1;
        Nodo nodoAux = primero;

        while (nodoAux != null) {
            if (i == posicion) {
                Nodo nodoNuevo = new Nodo(valor);
                nodoNuevo.setSiguiente(nodoAux.getSiguiente());
                nodoAux.setSiguiente(nodoNuevo);
                break;
            }
            i++;
            nodoAux = nodoAux.getSiguiente();
        }
    }
    //Inserta un nodo en la posición posicion con valor valor

    private static Nodo getLastNode(Lista lista) {
        Nodo nodoAux = lista.primero;
        while (nodoAux.getSiguiente() != null) {
            nodoAux = nodoAux.getSiguiente();
        }
        return nodoAux;
    }

    public static void mergeList(Lista listaUno, Lista listaDos) {
        Nodo nodoAux = Lista.getLastNode(listaDos);
        nodoAux.setSiguiente(listaUno.primero);

    }
}
