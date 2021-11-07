package ENTIDADES;

/**
 *
 * @author Julio Cabrera
 */
public class Telefonos {
    String IME;
    String modelo;
    String marca;
    String MAC;
    int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Telefonos(){}

    public String getIME() {
        return IME;
    }

    public void setIME(String IME) {
        this.IME = IME;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }
    
    
            
}
