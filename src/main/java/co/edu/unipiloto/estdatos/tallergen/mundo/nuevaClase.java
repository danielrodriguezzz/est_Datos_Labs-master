package co.edu.unipiloto.estdatos.tallergen.mundo;

import co.edu.unipiloto.estdatos.tallergen.mundo.Electronico.Gama;

/**
 *
 * @author felipe
 */
public class nuevaClase extends Electronico {
    
    private SistemaOperativo sistemaOperativo;


    
    public enum SistemaOperativo {
        LINUX, WINDOWS, MAC
    }
    
    public nuevaClase(Gama PGama, double precio, SistemaOperativo sistemaOperativo) {
        super(PGama, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
      return "Computador "+sistemaOperativo.name()+" - "+"Gama "+gama+ "($ "+precio+")";   }
}
