package sustentacion;

public class Data {

    private String nombre;
    private Double precio;
    private Integer cantidad,venta;
    private Double valorunidad;
    private Double contador;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
    public Double getValorunidad() {
        return valorunidad;
    }

    /**
     * @param valorunidad the valorunidad to set
     */
    public void setValorunidad(Double valorunidad) {
        this.valorunidad = valorunidad;
    }

    /**
     * @return the venta
     */
    public Integer getVenta() {
        return venta;
    }

    /**
     * @param venta the venta to set
     */
    public void setVenta(Integer venta) {
        this.venta = venta;
    }

    /**
     * @return the contador
     */
    public Double getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(Double contador) {
        this.contador = contador;
    }
    
    
}
