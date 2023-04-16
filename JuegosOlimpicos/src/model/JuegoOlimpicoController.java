package model;

import java.util.ArrayList;
import java.util.Collections;

public class JuegoOlimpicoController {

    private ArrayList<Pais> paises;

    public JuegoOlimpicoController() {
        this.paises = new ArrayList<Pais>();
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    public void registerCountry(String input){
        input = input.toLowerCase();
        String[] data =input.split("::");

        for(int i = 0; i < paises.size(); i++){
            if(data[0].equals(paises.get(i).getName())){
                if(data[1].equals("oro")){
                    int temp = paises.get(i).getOro();
                    temp += Integer.parseInt(data[2]);
                    paises.get(i).setOro(temp);
                    return;
                } if(data[1].equals("plata")){
                    int temp = paises.get(i).getPlata();
                    temp += Integer.parseInt(data[2]);
                    paises.get(i).setPlata(temp);
                    return;
                }if(data[1].equals("bronce")){
                    int temp = paises.get(i).getBronce();
                    temp += Integer.parseInt(data[2]);
                    paises.get(i).setBronce(temp);
                    return;
                }
            }
        }
        if(data[1].equals("oro")){
            paises.add(
                    new Pais(data[0], Integer.parseInt(data[2]), 0, 0)
            );
            return;
        }if(data[1].equals("plata")){
            paises.add(
                    new Pais(data[0], 0, Integer.parseInt(data[2]), 0)
            );
            return;
        }if(data[1].equals("bronce")){
            paises.add(
                    new Pais(data[0], 0, 0, Integer.parseInt(data[2]))
            );
            return;
        }
    }


}
