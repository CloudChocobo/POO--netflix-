public class Spectateur {

    private String nom;
    private int age;

    private ArrayList<Film> filmsVisionnes;

    public spectateur(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.filmsVisonnes = new ArrayList<Film>();

    }

    public ArrayList<Film>getFilmsVisonnes() {
        return filmsVisionnes;
    }
}