package ba.unsa.etf.rpr;

public class Supermarket {
    int max_artikl=0;
    Artikl[] niz_artikl;
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl povratni=null;
        for(int i=0;i<1000;i++){
            if(niz_artikl[i].Kod.equals(kod)){
                povratni=niz_artikl[i];
                niz_artikl[i]=null;
            }
        }
        return povratni;
    }
    public boolean dodajArtikl(Artikl a){
        if(max_artikl==1000)return false;
        else for (int i = 0; i < 1000; i++)
            if (niz_artikl[i] == null) {
                niz_artikl[i] = a;
                max_artikl++;
                return true;
            }
        return true;
    }
    public Artikl[] getArtikli(){

        return niz_artikl;
    }

}
