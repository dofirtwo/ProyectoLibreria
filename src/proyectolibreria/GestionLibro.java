/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolibreria;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class GestionLibro {

    private static ArrayList<Libro> Lista;

    public GestionLibro() {
        Lista = new ArrayList<>();
    }

    /**
     * agrega un libro a la lista
     *
     * @param libro: objeto de tipo libro
     * @return true o false
     */
    public static boolean AgregarLibro(Libro libro) {
        boolean agregar = Lista.add(libro);
        return agregar;
    }

    public static ArrayList<Libro> listar() {
        return Lista;
    }

    public static Libro ConsultarCodigo(String Codigo) {
        Libro libro = null;
        for (Libro l : Lista) {
            if (l.getCodigo().equals(Codigo)) {
                libro = l;
                break;
            }
        }
        return libro;
    }

    public static Libro ConsultarAutor(String Autor) {
        Libro libro = null;
        for (Libro l : Lista) {
            if (l.getAutor().equals(Autor)) {
                libro = l;
                break;
            }
        }
        return libro;
    }

    public static Libro ConsultarIdioma(String Idioma) {
        Libro libro = null;
        for (Libro l : Lista) {
            if (l.getIdioma().equals(Idioma)) {
                libro = l;
                break;
            }
        }
        return libro;
    }

    public static void Actualizar(Libro NuevoLibro) {
        for (Libro libro : Lista) {
            if (libro.getCodigo().equals(NuevoLibro.getCodigo())) {
                libro.setAutor(NuevoLibro.getAutor());
                libro.setDescripcion(NuevoLibro.getDescripcion());
                libro.setEditorial(NuevoLibro.getEditorial());
                libro.setFechaPublicacion(NuevoLibro.getFechaPublicacion());
                libro.setFoto(NuevoLibro.getFoto());
                libro.setIdioma(NuevoLibro.getIdioma());
                libro.setNumeroPaginas(NuevoLibro.getNumeroPaginas());
                libro.setTitulo(NuevoLibro.getTitulo());
                Lista.add(libro);
            }
        }
    }

    public static boolean ExisteLibro(String Codigo) {
        boolean existe = false;
        for (Libro libro : Lista) {
            if (libro.getCodigo().equals(Codigo)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static boolean Existe(String Autor) {
        boolean existe = false;
        for (Libro libro : Lista) {
            if (libro.getAutor().equals(Autor)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static void Eliminar(String Codigo) {
        for (Libro l : Lista) {
            if (l.getCodigo().equals(Codigo)) {
                Lista.remove(l);
                break;
            }
        }
    }
}
