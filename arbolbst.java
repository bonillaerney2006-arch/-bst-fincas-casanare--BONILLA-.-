public class ArbolBST {

    private NodoAnimal raiz;

    // === Constructor ===
    public ArbolBST() {

        this.raiz = null;
    }

    // === Método público de inserción ===
    public void insertar(int codigo,
                         String raza,
                         double peso,
                         int edad) {

        NodoAnimal nuevo =
                new NodoAnimal(
                        codigo,
                        raza,
                        peso,
                        edad
                );

        raiz = insertarRec(raiz, nuevo);
    }

    // === Método recursivo de inserción ===
    private NodoAnimal insertarRec(NodoAnimal nodo,
                                   NodoAnimal nuevo) {

        if (nodo == null) {

            return nuevo;
        }

        if (nuevo.getCodigo() < nodo.getCodigo()) {

            nodo.setIzquierdo(
                    insertarRec(
                            nodo.getIzquierdo(),
                            nuevo
                    )
            );

        } else {

            nodo.setDerecho(
                    insertarRec(
                            nodo.getDerecho(),
                            nuevo
                    )
            );
        }

        return nodo;
    }

    // === Recorrido Inorden ===
    public void recorrerInorden() {

        inordenRec(raiz);
    }

    private void inordenRec(NodoAnimal n) {

        if (n != null) {

            inordenRec(n.getIzquierdo());

            System.out.println(
                    "Código: " + n.getCodigo() +
                    " | Raza: " + n.getRaza() +
                    " | Peso: " + n.getPeso() +
                    " | Edad: " + n.getEdad()
            );

            inordenRec(n.getDerecho());
        }
    }

    // === Buscar nodo ===
    public NodoAnimal buscar(int codigo) {

        NodoAnimal actual = raiz;

        while (actual != null) {

            if (codigo == actual.getCodigo()) {

                return actual;
            }

            if (codigo < actual.getCodigo()) {

                actual = actual.getIzquierdo();

            } else {

                actual = actual.getDerecho();
            }
        }

        return null;
    }

    // === Modificar nodo ===
    public boolean modificar(int codigo,
                             double nuevoPeso,
                             int nuevaEdad) {

        NodoAnimal encontrado =
                buscar(codigo);

        if (encontrado != null) {

            encontrado.setPeso(nuevoPeso);
            encontrado.setEdad(nuevaEdad);

            return true;
        }

        return false;
    }
}
