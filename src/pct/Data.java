package pct;

/**
 *
 * @author edson
 */
public class Data {

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //Atributo
    private int dia;
    private int mes;
    private int ano;
    
    public String imprimirData (){
        return dia + "/" + mes + "/" + ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <=31){           
            this.dia = dia;
        } else {
            this.dia = 1;
        }

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    Data(int dia, int mes, int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;        
    }
    
    Data(){
        this.dia=1;
        this.mes=1;
        this.ano=1;        
    }
}