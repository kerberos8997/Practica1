public class caracteristicas {
    private String marca;
    private int year;
    private String modelo;
    private String color;
    private int npuertas;

    //CONSTRUCTOR
    public caracteristicas(String marca, int year, String modelo, String color, int npuertas) {
        this.marca = marca;
        this.year = year;
        this.modelo = modelo;
        this.color = color;
        this.npuertas = npuertas;
    }

    //constructor vacio
    public caracteristicas(){}

    public String getMarca(){
        return marca;
    }

    public int getYear(){
        return year;
    }

    public String getModelo(){
        return modelo;
    }

    public String getColor(){
        return color;
    }
    public int getNpuertas(){
        return npuertas;
    }
}
