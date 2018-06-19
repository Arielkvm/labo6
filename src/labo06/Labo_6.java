package labo06;

import dao.FiltroDao;
import java.util.ArrayList;
import modelo.Filtro;

/**
 * @author kevin
 */
public class Labo_6 {

    public static void main(String[] args) {
        FiltroDao fd = new FiltroDao();
        
        ArrayList<Filtro> todos = fd.readAll();
        
        for(Filtro f : todos){
            System.out.println(f.toString());
        }
        
        
    }
    
}
