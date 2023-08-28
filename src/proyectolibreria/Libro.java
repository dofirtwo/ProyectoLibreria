package proyectolibreria;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Libro {
    private String Codigo;
    private String Titulo;
    private String Autor;
    private String Editorial;
    private String Idioma;
    private int NumeroPaginas;
    private Date FechaPublicacion;
    private String Descripcion;
    private Image Foto;
    
    public Libro() {
    }
    /**
     * constructor con parametros de inicializacion
     * @param Codigo: codigo isbn del libro
     * @param Titulo: titulo del libro
     * @param Autor: nombre del autor
     * @param Editorial: nombre de la editorial
     * @param Idioma: idioma del texto del libro
     * @param NumeroPaginas; numero de painas del libro
     * @param FechaPublicacion: fecha de publicacion del libro;
     * @param Descripcion: breve descripcion del libro
     * @param Foto:foto de portada del libro 
     */
   public Libro(String Codigo, String Titulo, String Autor, String Editorial, String Idioma, int NumeroPaginas, Date FechaPublicacion, String Descripcion, Image Foto) {
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.Idioma = Idioma;
        this.NumeroPaginas = NumeroPaginas;
        this.FechaPublicacion = FechaPublicacion;
        this.Descripcion = Descripcion;
        this.Foto = Foto;
    }


    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date FechaPublicacion) {
        this.FechaPublicacion = FechaPublicacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Image getFoto() {
        return Foto;
    }

    public void setFoto(Image Foto) {
        this.Foto = Foto;
    }
    
}
