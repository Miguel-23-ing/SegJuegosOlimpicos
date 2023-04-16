package model;

public class Pais implements Comparable<Pais>{

    private String name;
    private int oro;
    private int plata;
    private int bronce;

    public Pais(String name, int oro, int plata, int bronce) {
        this.name = name;
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public int getBronce() {
        return bronce;
    }

    public void setBronce(int bronce) {
        this.bronce = bronce;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "name='" + name + '\'' +
                ", oro=" + oro +
                ", plata=" + plata +
                ", bronce=" + bronce +
                '}';
    }

    @Override
    public int compareTo(Pais o) {
        int criteria1 = o.getOro() - this.getOro();
        if(criteria1 == 0 ){
            int criteria2 = o.getPlata() - this.getPlata();
            if(criteria2 == 0 ) return o.getBronce() - this.getBronce() ;
            else return criteria2;
        } else return criteria1;
    }
}
