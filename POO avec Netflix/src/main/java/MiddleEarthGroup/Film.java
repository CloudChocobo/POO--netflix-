import java.util.Date;

public class Film {

    private String titre;
    private String resume;
    private Date dateSortie;
    private int duree;
    private Genre genre;
    private Type type;

    private ArrayList<Acteur> acteurs;


    public Film(String titre, Date dateSortie, int duree) {
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.duree = duree;
        this.acteurs = new ArrayList<Acteur>();

    }

   public ArrayList<Acteur>getActeurs() {
       return Acteurs;
   }

    
    
}