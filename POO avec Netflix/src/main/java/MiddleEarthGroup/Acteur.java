public class Acteur {

    private String nom;
    private String prenom;

    private ArrayList<Film> films;

    public Acteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.films = new ArrayList<Film>();
    }

    public ArrayList<Film>getFilms() {
        return films;
    }
 
}
