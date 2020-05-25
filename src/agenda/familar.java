/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author akbal
 */
public class familar {
    public void crearEvento(evento nuevo){
        try {
            File f = new File("eventos familiares.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()){
                fw = new FileWriter(f,true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(nuevo.Nombre+"%"+nuevo.Fecha+"%"+nuevo.Hora+"%"
                        +nuevo.lugar+"%"+nuevo.organizador+"%"+nuevo.telefono+"%"+nuevo.correo);
            }else{
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(nuevo.Nombre+"%"+nuevo.Fecha+"%"+nuevo.Hora+"%"
                        +nuevo.lugar+"%"+nuevo.organizador+"%"+nuevo.telefono+"%"+nuevo.correo);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
}
}
