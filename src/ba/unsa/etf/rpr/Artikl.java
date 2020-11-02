package ba.unsa.etf.rpr;

public class Artikl {
    String Naziv="";
    int Cijena;
    int Kod;
    Artikl(String naziv,int cijena,int kod){
        dodajArtikl(naziv,cijena,kod);
    }
    public void dodajArtikl(String Naziv,int Cijena, int Kod){
        this.Naziv=Naziv;this.Cijena=Cijena;this.Kod=Kod;
    }
    public String getNaziv(){
        return Naziv;
    }
    public int getCijena(){
        return Cijena;
    }
    public int getKod(){
        return Kod;
    }
}
