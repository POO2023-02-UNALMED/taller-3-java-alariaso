package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
//        numTV++;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int n) {
        numTV = n;
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if (permitidoCambiarCanal(canal + 1))
            canal++;
    }

    public void canalDown() {
        if (permitidoCambiarCanal(canal - 1))
            canal--;
    }

    public void volumenUp() {
        if (permitidoCambiarVolumen(volumen + 1))
            volumen++;
    }

    public void volumenDown() {
        if (permitidoCambiarVolumen(volumen - 1))
            volumen--;
    }

    private boolean permitidoCambiarCanal(int canal) {
        if (!estado)
            return false;

        if (canal >= 1 && canal <= 120)
            return true;

        return false;
    }

    private boolean permitidoCambiarVolumen(int volumen) {
        if (!estado)
            return false;

        if (volumen >= 0 && volumen <= 7)
            return true;

        return false;
    }
}