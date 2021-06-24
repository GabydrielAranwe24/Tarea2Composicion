package ico.fes.componentes;

public class Computadora {

    private String marca;
    private String modelo;
    private CPU cpu;
    private Monitor monitores;
    private Mouse mouse;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, CPU cpu, Monitor monitores, Mouse mouse, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cpu = cpu;
        this.monitores = monitores;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Monitor getMonitores() {
        return monitores;
    }

    public void setMonitores(Monitor monitores) {
        this.monitores = monitores;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", cpu=" + cpu + ", monitores=" + monitores + ", mouse=" + mouse + ", teclado=" + teclado + '}';
    }

}
