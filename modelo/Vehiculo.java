public abstract class Vehiculo{
    private String patente;
    private double velocidadKmh;
    private double capacidadKg;
    private double costoPorKm;

    public abstract double calcularTiempoEntrega(double km);

    public boolean puedeTransportar(Pedido pedido){
           if(peso.getPesokg() <= capacidadkg) {
            return true;
           }
            else {
            return false;
           }
        
    }
   

public String getPatente() {
    return patente;
}

public double getVelocidadKmH() {
    return velocidadKmH;
}

 public double capacidadKg() {
    return nombre;
}

public double getCostoPorKm() {
    return costoPorKm;
}

   //SETTERS
public void setPatente (string patente) {
    if (patente == null ) {
        System.out.println ("El nombre no puede estar vacio");
    } else {
    this.patente = patente;
 }
 }

public void setVelocidadKmH(double velocidadKmH) {
    if (velocidadKmH > 0) {
        this. velocidadKmH = velocidadKmH;
}    else {
    
       System.out.println ("El codigo debe ser un numero mayor que 0");
}
}

public void setCapacidadKg(double capacidadKg) {
    if (capacidadKg < 0) {
        System.out.println ("La capacidad no puede ser menor que 0");
    } else {
        this.capacidadKg = capacidadKg;
}
}

public void setCostoPorKm(double costoPorKm) {
    if (costoPorKm < 0) {
        System.out.println ("El costo no puede ser menor a 0");
    } else {
        this.costoPorKm = costoPorKm;
    }    
}
}
